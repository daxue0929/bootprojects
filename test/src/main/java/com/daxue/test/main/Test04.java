package com.daxue.test.main;


/**
 * @author wangxuedi
 * Date: 2020/5/11 16:13
 * describe:
 */
public class Test04 {
    public static void main(String[] args) {
        String usr = "15936312258";

//        boolean matches = usr.matches("^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$");
//        if (matches) {
//            System.out.println("是正确的手机号");
//        }else {
//            System.out.println("错误的手机号");
//        }

//        String str = "0";
//        Integer i = 0;
//        boolean equals = "5".equals(5);
//        if ("5".equals(5)) {
//            System.out.println("true");
//        }


//        ArrayList<Integer> array = new ArrayList<>();
//        array.add(1);
//        array.add(2);
//        array.add(3);
//        array.add(4);

        String str = "[65, 67]";
        String[] split = str.substring(1, str.length() - 1).split(",");

        for (int i =0; i< split.length ;i++) {
            split[i] = split[i].trim();
        }

        System.out.println("chirden");

        //        for (String s: split) {
//            String trim = s.trim();
//        }
//        System.out.println(array);


        int[] a = {1,2,3,4};


    }

}
