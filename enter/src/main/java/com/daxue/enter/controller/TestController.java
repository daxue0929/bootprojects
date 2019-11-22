package com.daxue.enter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/")
    public String test() {
        System.out.println("123");

        return "enter interface is good";
    }

    @GetMapping(value = "/hello")
    public String go () {
        System.out.println("哈哈");
        return "Hello World";
    }
}
