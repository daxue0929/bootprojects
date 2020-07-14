package com.daxue.mplus.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName(value = "user", schema = "base")
public class User {

    @TableId(type = IdType.AUTO)
    Integer id;

    String name;

    Integer age;

    Integer status;

    String account;

    String password;

    Integer groupId;

    Timestamp createTime;
}
