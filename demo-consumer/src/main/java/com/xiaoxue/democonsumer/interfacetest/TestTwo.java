package com.xiaoxue.democonsumer.interfacetest;

public interface TestTwo {

    default void print() {
        System.out.println("TestTwo print");
    };
}
