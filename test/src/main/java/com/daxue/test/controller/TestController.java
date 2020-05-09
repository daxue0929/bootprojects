package com.daxue.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 * @date 2020/03/12
 **/
@RestController
public class TestController {

    @GetMapping("")
    public String test() {


        return "";
    }


}
