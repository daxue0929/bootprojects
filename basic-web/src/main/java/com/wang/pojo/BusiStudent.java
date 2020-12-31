package com.wang.pojo;

import java.io.Serializable;

public class BusiStudent implements Serializable {
    private static final long serialVersionUID = -6845859448094968208L;

    private Integer id;
    private String  name;
    private Integer age;
    private Integer sex;
    private Integer classId;

    public BusiStudent() {
    }

    public BusiStudent(Integer id, String name, Integer age, Integer sex, Integer classId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.classId = classId;
    }

    public Integer getId() {
        return id;
    }

    public BusiStudent setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BusiStudent setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public BusiStudent setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Integer getSex() {
        return sex;
    }

    public BusiStudent setSex(Integer sex) {
        this.sex = sex;
        return this;
    }

    public Integer getClassId() {
        return classId;
    }

    public BusiStudent setClassId(Integer classId) {
        this.classId = classId;
        return this;
    }
}
