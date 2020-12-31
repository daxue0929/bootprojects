package com.wang.pojo;

import java.io.Serializable;

public class SysRole implements Serializable {

    private static final long serialVersionUID = -5438711503739422694L;

    private Integer id;
    private String   name;

    public SysRole() {
    }

    public SysRole(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public SysRole setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SysRole setName(String name) {
        this.name = name;
        return this;
    }
}
