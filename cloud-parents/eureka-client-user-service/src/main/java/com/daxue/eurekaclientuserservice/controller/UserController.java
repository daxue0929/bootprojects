package com.daxue.eurekaclientuserservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daxue0929
 * @date 2021/03/25
 **/
@RestController
public class UserController {

    @GetMapping(value = "/user/hello")
    public String hello() {
        return "hello";
    }

}
