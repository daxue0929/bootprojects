package com.daxue.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "base.user")
public class User {

    public int id;

    public String name;

    public Integer age;

    public Short status;

    public String account;

    public String password;

    public Integer groupId;
}
