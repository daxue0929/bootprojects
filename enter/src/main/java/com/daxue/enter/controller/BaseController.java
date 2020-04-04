package com.daxue.enter.controller;

import com.daxue.enter.Hello;
import com.daxue.enter.config.PassToken;
import com.daxue.enter.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 * @date 2020/03/27
 **/
@RestController
public class BaseController {

    @Autowired
    public Hello hello;


    @GetMapping(value = "/notRole")
    public String notRole() {
        return "没有权限的页面";
    }

    @PassToken
    @GetMapping(value = "test06")
    public Result test06() {
        String jerry = hello.sayHello("test06");
        return Result.success(jerry);
    }

}
