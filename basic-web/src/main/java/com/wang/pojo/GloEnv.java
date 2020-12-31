package com.wang.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class GloEnv implements Serializable {
    private static final long serialVersionUID = 1863124099565630625L;

    private Integer   id;
    private String    key;
    private String    value;
    private String    description;
    private Timestamp createTime;

    public GloEnv() {
    }

    public GloEnv(Integer id, String key, String value, String description, Timestamp createTime) {
        this.id = id;
        this.key = key;
        this.value = value;
        this.description = description;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public GloEnv setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getKey() {
        return key;
    }

    public GloEnv setKey(String key) {
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public GloEnv setValue(String value) {
        this.value = value;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GloEnv setDescription(String description) {
        this.description = description;
        return this;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public GloEnv setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }
}
