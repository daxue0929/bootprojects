package com.daxue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class EnterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterApplication.class, args);
    }
}

