package com.daxue.test.A;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    public Integer id;

    public String name;

    public Integer age;

    public User() {
    }

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
