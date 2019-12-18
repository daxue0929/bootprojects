package com.daxue.enter.util;

import java.io.*;

/**
 * 残缺类
 */
public class FileUtil {

    FileOutputStream fileOutputStream;



    BufferedWriter writer;


    void test() throws IOException {


        File file = new File("/today");
        if (file.exists()){
            file.createNewFile();
        }

        fileOutputStream = new FileOutputStream(file);

        writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));


    }
}
