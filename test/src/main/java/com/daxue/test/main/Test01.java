package com.daxue.test.main;

/**
 * @author wangxuedi
 * Date: 2020/4/1 14:09
 * describe:
 */
public class Test01 {
    public static void main(String[] args) {
//        String httpMoUrl = "http://127.0.0.1:2061/gateway-sms/deliver/templateStstus?id=1098";
//
//        //inform
//        String predix = httpMoUrl.substring(0, httpMoUrl.lastIndexOf("?"));
//        String suffix = httpMoUrl.substring(httpMoUrl.lastIndexOf("?"));
//        String result =  predix + "/inform" + suffix;
//        System.out.println(result);


//        String currentLine = "13588852580 工号:710359姓名:张  鲲路别:班别:车号:报到时间:休息备注:材差:";
//        String currentLine = "13588";
//        String usr = currentLine.substring(0, 11);
////        String content = currentLine.substring(12, currentLine.length() - 1);
//
//        boolean matches = usr.matches("^1[0-9]{10}$");
//        System.out.println(matches);
//
//        System.out.println(usr);
//        System.out.println(content);


//        String header[] =null;
//        header = new String[]{"手机号码", "content"};
//
//
//        System.out.println(header.length);

        String tempPath = "/usr/local/backmgr/upload/matask/140026/20200508/521c7ad9269048fdbcd041c5463e4aa5.xlsx";

        String name = tempPath.substring(0, tempPath.lastIndexOf(".")) + "_content" + tempPath.substring(tempPath.lastIndexOf("."));


        System.out.println(name);

        int i = tempPath.lastIndexOf(".");

        String s = tempPath.substring(0, i);
        System.out.println(s);
        System.out.println(s.endsWith("_content"));

//
//        String currentMsg = "你好测试短信{aa}451{dasd}";
//
//        String pattern = "\\{[^}]*\\}";
//        Pattern p = Pattern.compile(pattern);
//        Matcher m = p.matcher(currentMsg);
//        while (m.find()) {
//            String g = m.group();
//            currentMsg = currentMsg.replace(g,"{content}");
//            break;
//        }
//
//
////        String content = currentMsg.replaceAll("\\{.+^}", "content");
//        System.out.println(currentMsg);


    }
}
