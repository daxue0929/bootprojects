package com.wang.pojo;

import java.sql.Timestamp;

public class SysUser {

    private Integer  id;
    private String    name;
    private String    password;
    private String    email;
    private String    phone;
    private Timestamp createtime;
    private Timestamp updatetime;
    private String    account;
    private String    description;

    public SysUser() {}

    public Integer getId() {
        return id;
    }

    public SysUser setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SysUser setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public SysUser setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public SysUser setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public SysUser setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public SysUser setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
        return this;
    }

    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public SysUser setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public SysUser setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public SysUser setDescription(String description) {
        this.description = description;
        return this;
    }
}
