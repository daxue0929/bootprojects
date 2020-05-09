package com.daxue.test.main;

import com.daxue.test.utils.EncodingDetect;

import java.io.*;

/**
 * @author wangxuedi
 * Date: 2020/5/9 9:43
 * describe:
 */
public class Test03 {

    public static void main(String[] args) {
        try {
//            d
            String inputFileUrl = "I:/test/2017-05-14一车队 - 副本.txt";

            String outputFileUrl = "I:/test/2017-05-14一车队 - 副本_utf_8.txt";

            File file = new File(inputFileUrl);
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());

            String inputFileEncode  = EncodingDetect.getJavaEncode(inputFileUrl);
            System.out.println("inputFileEncode===" + inputFileEncode);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFileUrl), inputFileEncode));

            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(outputFileUrl), "UTF-8"));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line + "\r\n");
            }
            bufferedWriter.close();
            bufferedReader.close();
            String outputFileEncode = EncodingDetect.getJavaEncode(outputFileUrl);
            System.out.println("outputFileEncode===" + outputFileEncode);
            System.out.println("txt文件格式转换完成");

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }




    }

}
