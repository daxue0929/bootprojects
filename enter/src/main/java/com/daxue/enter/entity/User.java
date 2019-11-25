package com.daxue.enter.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {

    public Integer id;

    public String name;

    public Integer age;

    public Short status;

    public String account;

    public String password;

    public Integer groupId;
}
