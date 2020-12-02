package com.xiaoxue.democonsumer.interfacetest;

public class TestTest implements TestOne, TestTwo{

    @Override
    public void print() {
        System.out.println("重新修改的实现～");
        TestOne.super.print();//指定TestOne中的方法
    }
}
