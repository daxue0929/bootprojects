package com.wang.pojo;

import java.io.Serializable;

public class BusiTeacher implements Serializable {
    private static final long serialVersionUID = -698452095366081572L;

    private Integer id;
    private String  name;
    private Integer age;
    private Integer sex;

    public BusiTeacher() {
    }

    public BusiTeacher(Integer id, String name, Integer age, Integer sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public BusiTeacher setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BusiTeacher setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public BusiTeacher setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Integer getSex() {
        return sex;
    }

    public BusiTeacher setSex(Integer sex) {
        this.sex = sex;
        return this;
    }
}
