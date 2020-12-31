package com.wang.pojo;

import java.io.Serializable;

public class BusiScore implements Serializable {
    private static final long serialVersionUID = 931511772152607668L;

    private Integer id;
    private String  name;
    private Integer subjectId;
    private Integer value;
    private Integer studentId;

    public BusiScore() {
    }

    public BusiScore(Integer id, String name, Integer subjectId, Integer value, Integer studentId) {
        this.id = id;
        this.name = name;
        this.subjectId = subjectId;
        this.value = value;
        this.studentId = studentId;
    }

    public Integer getId() {
        return id;
    }

    public BusiScore setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BusiScore setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public BusiScore setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
        return this;
    }

    public Integer getValue() {
        return value;
    }

    public BusiScore setValue(Integer value) {
        this.value = value;
        return this;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public BusiScore setStudentId(Integer studentId) {
        this.studentId = studentId;
        return this;
    }
}
