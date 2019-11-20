package com.daxue.test.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;

@RestController
public class VerifyController {



    @PostMapping(value = "/getMsisdn")
    public String getMsisdn(@RequestBody EntityTest entityTest
    ) {
        System.out.println(entityTest.toString());
        System.out.println("das");

        return "后端返回的数据";
    }

    @PostMapping(value = "/test005")
    public String test005() {

        System.out.println("进来测试方法");
        return "后端返回的数据";
    }
}
