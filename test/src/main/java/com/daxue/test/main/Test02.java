package com.daxue.test.main;

import java.io.File;

/**
 * @author wangxuedi
 * Date: 2020/4/3 18:29
 * describe:
 */
public class Test02 {
    public static void main(String[] args) {

        File file = new File("/usr/local/backmgr/upload/test.zip");
        System.out.println(file.length());


    }
}
