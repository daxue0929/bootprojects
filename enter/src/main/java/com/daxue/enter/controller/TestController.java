package com.daxue.enter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping(value = "/")
    public String test() {
        System.out.println("123");

        return "enter interface is good";
    }

    @GetMapping(value = "/hello")
    public String go () {
        String a = "爱你啊";

        logger.info("爱你");
        logger.error("das");
        logger.warn("today is {}", a);

        return "Hello World";
    }
}
