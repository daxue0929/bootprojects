package com.daxue.test;

import java.util.ArrayList;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        RandomNum randomNum=new RandomNum();
        Thread thread1=new Thread(randomNum);
        Thread thread2=new Thread(randomNum);
        Thread thread3=new Thread(randomNum);
        Thread thread4=new Thread(randomNum);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        for (String str: randomNum.getArrayList()) {
            System.out.println(str);
        }
    }
}

class RandomNum implements Runnable {
    private ArrayList<String> arrayList = new ArrayList<>();

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        Random random = new Random();
        arrayList.add(Thread.currentThread().getName()+"----------------"+random.nextInt(100));
    }
}
