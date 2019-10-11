package com.daxue.enter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EnterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterApplication.class, args);
    }

    @GetMapping(value = "/")
    public String test () {

        return "启动成功";
    }

}
