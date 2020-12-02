package com.xiaoxue.democonsumer.function;

@FunctionalInterface
public interface TestFunction {
    void abstractFun();//只定义了一个抽象方法,如再定义一个抽象方法，则会报错

    default void defaultFun() {
        System.out.println("默认方法");
    }

    static void staticFun(){
        System.out.println("static方法");
    }

}
