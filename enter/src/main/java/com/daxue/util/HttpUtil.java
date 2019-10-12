package com.daxue.util;



import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class HttpUtil {

    public static final String CONTENT_TYPE="Content-Type";
    public static final String CONTENT_TYPE_FORM="application/x-www-form-urlencoded";
    public static final String CONTENT_TYPE_JSON="application/json";

    private static Logger log = LoggerFactory.getLogger(HttpUtil.class);

    public static String get(String url){
        return request(url,"GET",null,null);
    }

    public static String get(String url,Map<String,Object> params ){
        return request(url,"GET",params,null);
    }

    public static String post(String url){
        return request(url,"POST",null,null);
    }

    public static String post(String url,Map<String,Object> params ){
        return request(url,"POST",params,null);
    }

    public static String post(String url,Map<String,Object> params,Map<String,String> headers ){
        return request(url,"POST",params,headers);
    }

    public static String request(String url,String method,Map<String,Object> params,Map<String,String> headers) {
        BufferedReader in = null;
        HttpURLConnection conn = null;
        String result = "";
        try {
            if(url.startsWith("https://")){
                //该部分必须在获取connection前调用
                trustAllHttpsCertificates();
                HostnameVerifier hv = new HostnameVerifier() {
                    public boolean verify(String urlHostName, SSLSession session) {
                        System.out.println("Warning: URL Host: " + urlHostName + " vs. " + session.getPeerHost());
                        return true;
                    }
                };
                HttpsURLConnection.setDefaultHostnameVerifier(hv);
            }
            if(method.equalsIgnoreCase("GET") && params!=null){
                url += "?"+toUrlString(params);
                log.info("get {}",url);
            }

            conn = (HttpURLConnection)new URL(url).openConnection();
            conn.setRequestMethod(method);
            conn.setRequestProperty(CONTENT_TYPE, CONTENT_TYPE_FORM);
            if(headers!=null){
                for(Map.Entry<String,String> entry:headers.entrySet()){
                    conn.setRequestProperty(entry.getKey(),entry.getValue());
                }
            }
            if(method.equalsIgnoreCase("POST") && params != null){
                conn.setDoOutput(true);
                OutputStream out=conn.getOutputStream();
                String data=null;
                if(conn.getRequestProperty(CONTENT_TYPE).equalsIgnoreCase(CONTENT_TYPE_JSON)){
                    data=toJson(params);
                }else {
                    data=toUrlString(params);
                }
                log.info("post {},header={},data={}",url,headers,data);
                out.write(data.getBytes());
                out.flush();
                out.close();
            }
            if(conn.getResponseCode()==200){
                in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                while ((line = in.readLine()) != null) {
                    result += line;
                }
                log.info("url={},result={}",url,result);
            }else {
                throw new Exception(String.format("http request fail respcode=%s",conn.getResponseCode()));
            }

        } catch (Exception e) {
            e.printStackTrace();
            log.info(e.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                log.info("关闭数据流出错了！\n"+ex.getMessage()+"\n");
            }
            conn.disconnect();
        }
        return result;
    }

    public static String toUrlString(Map<String,Object> map){
        StringBuffer param = new StringBuffer();
        int i=0;
        for(String key : map.keySet()){
            if(i>0){
                param.append("&");
            }
            param.append(key).append("=").append((String)map.get(key));
            i++;
        }
        return param.toString();
    }

    public static String toJson(Map<String,Object> map){
        JSONObject obj = new JSONObject();
        int i=0;
        for(String key : map.keySet()){
            obj.put(key,map.get(key));
        }
        return obj.toString();
    }

    private static void trustAllHttpsCertificates() throws Exception {
        javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1];
        javax.net.ssl.TrustManager tm = new MiTM();
        trustAllCerts[0] = tm;
        javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, null);
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
    }
    static class MiTM implements javax.net.ssl.TrustManager, javax.net.ssl.X509TrustManager {
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        public boolean isServerTrusted(java.security.cert.X509Certificate[] certs) {
            return true;
        }

        public boolean isClientTrusted(java.security.cert.X509Certificate[] certs) {
            return true;
        }

        public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType)
                throws java.security.cert.CertificateException {
            return;
        }

        public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType)
                throws java.security.cert.CertificateException {
            return;
        }
    }
}