package com.daxue.enter.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
@TableName(value = "base.user")
public class User {

    public Integer id;

    public String name;

    public Integer age;

    public Short status;

    public String account;

    public String password;

    public Integer groupId;
}
