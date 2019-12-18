package com.daxue.enter.util;

import lombok.Data;

import java.util.Random;

public interface EnumEnter {
    enum Status implements EnumEnter{
        STATUS1("待审核", 1), STATUS2("绿色", 2), STATUS3("绿色", 2), STATUS4("绿色", 2);

        private String name;
        private int index;

        // 构造方法
        private Status(String name, int index) {
            this.name = name;
            this.index = index;
        }
        // 普通方法
        public static String getName(int index) {
            for (Status c : Status.values()) {
                if (c.getIndex() == index) {
                    return c.name;
                }
            }
            return null;
        }

        // get set 方法
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getIndex() {
            return index;
        }
        public void setIndex(int index) {
            this.index = index;
        }
    }

    enum A implements EnumEnter{
        A1("待审核", 1), A2("绿色", 2), A3("绿色", 2), A4("绿色", 2);

        private String name;
        private int index;

        // 构造方法
        private A(String name, int index) {
            this.name = name;
            this.index = index;
        }
        // 普通方法
        public static String getName(int index) {
            for (A c : A.values()) {
                if (c.getIndex() == index) {
                    return c.name;
                }
            }
            return null;
        }

        // get set 方法
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getIndex() {
            return index;
        }
        public void setIndex(int index) {
            this.index = index;
        }
    }

    static void main(String[] args) {
        String name = Status.getName(1);
    }


}
