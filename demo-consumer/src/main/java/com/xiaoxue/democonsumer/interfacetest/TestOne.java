package com.xiaoxue.democonsumer.interfacetest;

public interface TestOne {
    default void print() {
        System.out.println("TestOne print");
    };
}
