package com.daxue.test.A;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    public Integer id;

    public String name;

    public int age;
}
