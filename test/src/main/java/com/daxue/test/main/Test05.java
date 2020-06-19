package com.daxue.test.main;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.daxue.test.utils.HttpClientUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.util.Base64Utils;
import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wangxuedi
 * Date: 2020/5/26 10:34
 * describe:
 */
public class Test05 {

    public static Test05 instance;

    int a;

    public static final String apiKey = "api_zhongshangsd";
    public static final String secret = "5ecb636e3b5bfbe6448d01a6";
    public static int timestamp = (int) (System.currentTimeMillis()/1000); // 秒

    public static void main(String[] args) throws UnsupportedEncodingException {
//        reportedSign("视频短信测试");
//        testJSON();
//        base64();
//        encode();
//        new Test05().test();
//        test06();
        test07();
    }


    public static void test07() {


    }

    public static void test06() {
        String aa = UUID.randomUUID().toString().trim().replaceAll("-", "");
        System.out.println(aa);
    }

    public void test() {
        System.out.println("dasd");
    }


    public static void encode() throws UnsupportedEncodingException {
        String s = "测试";
        String v = "ceshi";


        String encodeS = URLEncoder.encode(s, "UTF-8");
        String encodeV = URLEncoder.encode(v, "UTF-8");

        System.out.println(encodeS);
        System.out.println(encodeV);
    }

    public static void base64() throws UnsupportedEncodingException {
        String title = "你好";


        byte[] bytes = title.getBytes();

        String s = Base64.getEncoder().encodeToString(bytes);
        System.out.println(s);


        byte[] gbks = title.getBytes("GBK");
//        String j = Base64.getEncoder().encodeToString(gbks);
        String j = Base64Utils.encodeToString(gbks);
        System.out.println(j);


    }


    public static void testJSON() {
        JSONArray jsonArray = new JSONArray();

        JSONObject itemJson = new JSONObject();
        itemJson.put("type", 1);
        itemJson.put("material", "http://yztsmstest.izton.com/upload/mms/resource/pkg/itemJson.jpg");

        JSONObject bb = new JSONObject();
        bb.put("type", 0);
        bb.put("material", "【视频测试短信】测试提交模板");

        jsonArray.add(itemJson);
        jsonArray.add(bb);

        String s = jsonArray.toJSONString();

        System.out.println(s);


    }

    public String parseResponse(String result) {
        JSONObject jsonObject = JSONObject.parseObject(result);
        String code = jsonObject.getString("ret_code");
        if ("200".equals(code)) {
            JSONObject resp = jsonObject.getJSONObject("resp");
            String sign_id = resp.getString("sign_id");
            return sign_id;
        }
        return "error";
    }

    public static void reportedSign(String signature) {
        try {


            String content = signature;
            File file = new File("I:/sign.jpg");
            byte[] bytes = FileUtils.readFileToByteArray(file);
            String qualifications = new BASE64Encoder().encode(bytes);
//            String qualifications = Base64Utils.encodeToUrlSafeString(bytes);

            Map<String, Object> params = new TreeMap<>();
            params.put("api_key", apiKey);
            params.put("timestamp", timestamp);
            params.put("content", content);
            params.put("qualifications", qualifications);
            String prefix = "POSThttps://sm.wostore.cn/sm/rest/v1.0/signature/create";

            String signStr = params.entrySet().stream().filter(e -> e.getValue() != null).map(e -> e.getKey() + "=" + e.getValue())
                    .collect(Collectors.joining("", prefix, secret));
//            System.out.println("StringSignStr: " + signStr); // 原始字符串

            String encode = URLEncoder.encode(signStr, "UTF-8");
            String sign = DigestUtils.md5Hex(encode);
            params.put("sign", sign);
//            System.out.println("md5Hex: " + sign);
            Map<String, String> head = new HashMap<>();
            head.put("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
            HttpClientUtils instance = HttpClientUtils.getInstance();

            String encodeKey = URLEncoder.encode(apiKey, "UTF-8");
            String encodeContent = URLEncoder.encode(content, "UTF-8");
            String encodeQualifications = URLEncoder.encode(qualifications, "UTF-8");
            String encodeSign = URLEncoder.encode(sign, "UTF-8");
            String encodeTimestamp = URLEncoder.encode(String.valueOf(timestamp), "UTF-8");

            String body = "api_key="+encodeKey+"&content="+encodeContent+"&qualifications="+encodeQualifications+"&sign="+ encodeSign +"&timestamp="+encodeTimestamp;
            System.out.println("请求参数为: " + body);
            String result = instance.httpPost("https://sm.wostore.cn/sm/rest/v1.0/signature/create", body, head);
            System.out.println("接口返回的参数是： " + result);
        } catch (Exception e) {
            System.out.println("type: {}, content: " + e.getClass().getTypeName() + e.getMessage());
        }
    }


    public static void reportSigns(String signature) {
        try {
            String apiKey = "api_zhongshangsd";
            int timestamp = (int) (System.currentTimeMillis()/1000);
            String content = signature;
            File file = new File("I:/sign.jpg");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }





    public static void readStram() {

        StringBuffer request = new StringBuffer();
        request.append("\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<mms>\n" +
                "    <result>0</result>\n" +
                "    <audis>\n" +
                "        <item>\n" +
                "            <mid>1907052123110000000</mid>\n" +
                "            <time>2019-07-05 21:24:04</time>\n" +
                "            <status>0</status>\n" +
                "            <desc>success</desc>\n" +
                "        </item>\n" +
                "        <item>\n" +
                "            <mid>1907052123110000000</mid>\n" +
                "            <time>2019-07-05 21:24:04</time>\n" +
                "            <status>0</status>\n" +
                "            <desc>success</desc>\n" +
                "        </item>\n" +
                "    </audis>\n" +
                "</mms>");

    }
}
