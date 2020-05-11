package com.daxue.test.main;

/**
 * @author wangxuedi
 * Date: 2020/5/11 16:13
 * describe:
 */
public class Test04 {
    public static void main(String[] args) {
        String usr = "15936312258";

        boolean matches = usr.matches("^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$");
        if (matches) {
            System.out.println("是正确的手机号");
        }else {
            System.out.println("错误的手机号");
        }


    }

}
