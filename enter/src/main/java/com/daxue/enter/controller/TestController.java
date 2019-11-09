package com.daxue.enter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//http://2738y987a8.qicp.vip:24325
@RestController
public class TestController {

    @GetMapping(value = "/test")
    public void test() {
        System.out.println("123");
    }

    @GetMapping(value = "/hello")
    public String go () {
        System.out.println("哈哈");
        return "Hello World";
    }
}
