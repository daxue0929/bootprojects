package com.wang.pojo;

import java.io.Serializable;

public class BusiSubject implements Serializable {
    private static final long serialVersionUID = 2857225262109336206L;

    private Integer id;
    private String  name;
    private String  description;
    private Integer credit;

    public BusiSubject() { }

    public BusiSubject(Integer id, String name, String description, Integer credit) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.credit = credit;
    }

    public Integer getId() {
        return id;
    }

    public BusiSubject setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BusiSubject setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BusiSubject setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getCredit() {
        return credit;
    }

    public BusiSubject setCredit(Integer credit) {
        this.credit = credit;
        return this;
    }
}
