package com.daxue.sdk.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.lang.JoseException;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.security.util.DerInputStream;
import sun.security.util.DerValue;

import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Controller
@Slf4j
public class TestSdkController {

    @RequestMapping("/test/sdk")
    public String accept(HttpServletRequest request) {
        String redirect_uri_key = request.getParameter("redirect_uri_key");
        String id_token = request.getParameter("id_token");

        if (StringUtils.isEmpty(redirect_uri_key)) {
            log.info("redirect_uri_key null");
        }

        if (StringUtils.isEmpty(id_token)) {
            log.info("id_token null");
        }

        log.info("redirect_uri_key: {}", redirect_uri_key);
        log.info("id_token: {}", id_token);
        Map<String, String[]> parameterMap = request.getParameterMap();
        String s = JSONObject.toJSONString(parameterMap);
        log.info("parameterMap: {}", s);
//        String result = buildJWT();

        String result ="eyJraWQiOiJ0ZXN0IyMjRmluZ2VyUHJpbnQiLCJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhcHBJbnN0YW5jZUlkIjoidGVzdEFwcEluc3RhbmNlSWQiLCJhdWQiOiJ5dWZ1Iiwic3ViIjoieHVlZGl3YW5nQHl1ZnVpZC5jb20iLCJpc3MiOiJ0ZXN0IiwidXNlcl9rZXkiOiJkYXh1ZSIsInRudCI6InRlbmFudCIsImV4cCI6MjYwNTg3MDYzNywiY3VzdG9tRmllbGRzS2V5IjoiY3VzdG9tRmllbGRzVmFsdWUiLCJpYXQiOjE2MDU4NzAzMzcsImVtYWlsIjoieHVlZGl3YW5nQHl1ZnVpZC5jb20ifQ.N4ymPBgMKh6sZQamwfXWwet2zeXFMUfWlq3xEF303S7D6EinDk0gNx7Lts124aHDtdhdGzC6piiqKJLxuCKXwvPHYzOUQCrEBuC1nLgfbq6mCwMKM8A3rI66zMf01Un4P9Jkm3R1WiQr82OvwcTFFMIG94y-Q6XTAfLFkN0-vYV6Aw73LJAjFGoOd9YhraKHXqAwI2r3adrSL_pX5nmIVmuAvnYlSsVpjYWisr9bzpoXVbPijZwHruCQTavP0ZFe9oQPqs7b7seiMhVKidCj7i7K77-tVHu2mm0oW2NaKVVBpo-oX4hqC_9uc6JmBuAEKiCb45E_zde45fBEXQwQbw";
        return "redirect:" + redirect_uri_key + "?id_token=" + result;

    }


    private String getPrivateKeyString() throws IOException {
        //    生成方法：安装openssl,执行     openssl genrsa -out private.pem 2048
        return IOUtils.toString(new FileInputStream("/Users/daxue0929/openSourceCodes/bootprojects/sdk/src/main/resources/private.pem"));
    }

    public String buildJWT() {
        try {
            String privateKeyString = getPrivateKeyString();
            PrivateKey privateKey = getPrivateKey(privateKeyString);
            final JwtClaims claims = new JwtClaims();
            claims.setClaim("email", "xuediwang@yufuid.com");
            claims.setSubject("xuediwang@yufuid.com");
            claims.setAudience("yufu");//用于验证签名是否合法，验证方必须包含这些内容才验证通过
            claims.setExpirationTimeMinutesInTheFuture(60 * 24 * 300);
            claims.setIssuedAtToNow();

            // Generate the payload
            final JsonWebSignature jws = new JsonWebSignature();
            jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA256);
            jws.setPayload(claims.toJson());
            jws.setKeyIdHeaderValue(UUID.randomUUID().toString());

            // Sign using the private key
            jws.setKey(privateKey);

            try {
                return jws.getCompactSerialization();
            } catch (JoseException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }


    private PrivateKey getPrivateKey(String privateKeyBase64) {
        String privKeyPEM = privateKeyBase64
                .replaceAll("\\-*BEGIN.*KEY\\-*", "")
                .replaceAll("\\-*END.*KEY\\-*", "");

        // Base64 decode the data
        byte[] encoded = Base64.decodeBase64(privKeyPEM);

        try {
            DerInputStream derReader = new DerInputStream(encoded);
            DerValue[] seq = derReader.getSequence(0);

            if (seq.length < 9) {
                throw new GeneralSecurityException("Could not read private key");
            }

            // skip version seq[0];
            BigInteger modulus = seq[1].getBigInteger();
            BigInteger publicExp = seq[2].getBigInteger();
            BigInteger privateExp = seq[3].getBigInteger();
            BigInteger primeP = seq[4].getBigInteger();
            BigInteger primeQ = seq[5].getBigInteger();
            BigInteger expP = seq[6].getBigInteger();
            BigInteger expQ = seq[7].getBigInteger();
            BigInteger crtCoeff = seq[8].getBigInteger();

            RSAPrivateCrtKeySpec keySpec = new RSAPrivateCrtKeySpec(modulus, publicExp, privateExp,
                    primeP, primeQ, expP, expQ, crtCoeff);

            KeyFactory factory = KeyFactory.getInstance("RSA");
            return factory.generatePrivate(keySpec);
        } catch (IOException | GeneralSecurityException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String httpsGet(String url) throws Exception {
        CloseableHttpClient hp = createSSLClientDefault();
        HttpGet hg = new HttpGet(url);
        CloseableHttpResponse response = hp.execute(hg);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity, "UTF-8");
        hp.close();
        return content;
    }

    public static CloseableHttpClient createSSLClientDefault() throws Exception {
        //如果下面的方法证书还是不过，报错的话试试下面第二种
        /* SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy(){
        //信任所有
        public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        return true;
        }
        }).build();
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);
        return HttpClients.custom().setSSLSocketFactory(sslsf).build();*/

        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                SSLContexts.custom().loadTrustMaterial(null, new TrustSelfSignedStrategy()).build(),
                NoopHostnameVerifier.INSTANCE);
        return HttpClients.custom().setSSLSocketFactory(sslsf).build();

    }


}
