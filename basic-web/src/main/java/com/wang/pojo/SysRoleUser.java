package com.wang.pojo;

import java.io.Serializable;

public class SysRoleUser implements Serializable {
    private static final long serialVersionUID = -3579821250586405294L;

    private Integer id;
    private Integer sysUserId;
    private Integer sysRoleId;

    public SysRoleUser() { }

    public SysRoleUser(Integer id, Integer sysUserId, Integer sysRoleId) {
        this.id = id;
        this.sysUserId = sysUserId;
        this.sysRoleId = sysRoleId;
    }

    public Integer getId() {
        return id;
    }

    public SysRoleUser setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getSysUserId() {
        return sysUserId;
    }

    public SysRoleUser setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
        return this;
    }

    public Integer getSysRoleId() {
        return sysRoleId;
    }

    public SysRoleUser setSysRoleId(Integer sysRoleId) {
        this.sysRoleId = sysRoleId;
        return this;
    }
}
