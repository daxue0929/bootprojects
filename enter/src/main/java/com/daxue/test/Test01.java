package com.daxue.test;

import org.junit.Test;

import java.util.*;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
//        RandomNum randomNum=new RandomNum();
//        Thread thread1=new Thread(randomNum);
//        Thread thread2=new Thread(randomNum);
//        Thread thread3=new Thread(randomNum);
//        Thread thread4=new Thread(randomNum);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//
//        thread1.join();
//        thread2.join();
//        thread3.join();
//        thread4.join();
//
//        for (String str: randomNum.getArrayList()) {
//            System.out.println(str);
//        }
//        long l = Long.parseLong(null);
//        System.out.println(l);

        Object obj = 1;

        if (obj.equals(1)){

            System.out.println("成功");
        }


    }

    @Test
    public void test002() {
        long l = Long.parseLong(null);
        System.out.println(l);
    }

    @Test
    public void test003 (){
        String[] s = {"da", "das"};
        List<String> strings = Arrays.asList(s);
        ArrayList<String> newList = new ArrayList<>();
        for (String ss: strings) {
            newList.add(ss);
        }

        System.out.println(newList);
    }

    @Test
    public void test004() {
        HashMap<String, Long> stringLongHashMap = new HashMap<>();
        stringLongHashMap.put("dda", (long) 4561);

        String strings = (String) stringLongHashMap.keySet().iterator().next();
        System.out.println(strings);


    }

    @Test
    public void test005() {
        String[] s = {"1", "a", "b", "da"};
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(s));
        System.out.println(strings);

    }

    @Test
    public void test006 () {
        System.out.println(new Date().getTime() /1000);
    }

}


