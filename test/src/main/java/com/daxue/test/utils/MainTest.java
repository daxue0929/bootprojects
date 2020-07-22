package com.daxue.test.utils;

import java.lang.reflect.Field;

public class MainTest {

    private static enum TestEnum {
        a(111,"AAA"),
        b(222,"BBB"),
        c(333,"CCC");


        private int value;
        private String text;
        TestEnum(int value,String text){
            this.value = value;
            this.text = text;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return "TestEnum{" +
                    "value=" + value +
                    ", text='" + text + '\'' +
                    '}';
        }
    };

    private static void addTestEnum(String enumName,int value,String text){
        DynamicEnumUtil.addEnum(TestEnum.class,enumName,new Class<?>[] {int.class,String.class},new Object[] {value,text});
    }

    public static void main(String[] args) {

        addTestEnum("d",444,"DDD");
        addTestEnum("e",555,"EEE");
        addTestEnum("f",666,"FFF");
        addTestEnum("g",777,"GGG");


        for (TestEnum testEnum:TestEnum.values()){
            System.out.println(testEnum.toString());
        }

        Class<TestEnum> ccc = TestEnum.class;
        Field[] fff = ccc.getDeclaredFields();
        TestEnum testEnum = TestEnum.b;
        switch (testEnum){
            case a:{
                System.out.println("22222reefwsfsds");
                break;
            }
            case b:
                System.out.println("bbb");
                break;
        }

    }

}
