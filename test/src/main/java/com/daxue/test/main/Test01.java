package com.daxue.test.main;

import java.io.File;

/**
 * @author wangxuedi
 * Date: 2020/4/1 14:09
 * describe:
 */
public class Test01 {
    public static void main(String[] args) {
        String httpMoUrl = "http://127.0.0.1:2061/gateway-sms/deliver/templateStstus?id=1098";

        //inform
        String predix = httpMoUrl.substring(0, httpMoUrl.lastIndexOf("?"));
        String suffix = httpMoUrl.substring(httpMoUrl.lastIndexOf("?"));
        String result =  predix + "/inform" + suffix;
        System.out.println(result);

    }
}
