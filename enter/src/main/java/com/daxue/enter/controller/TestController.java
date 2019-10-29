package com.daxue.enter.controller;

import com.daxue.enter.dao.MaDaoTest;
import com.daxue.enter.model.Ma;
import org.springframework.beans.factory.annotation.Autowired;
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
