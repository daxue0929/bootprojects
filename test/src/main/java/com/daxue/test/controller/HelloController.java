package com.daxue.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * @author wangxuedi
 * Date: 2020/5/14 10:13
 * describe:
 */
@RestController
@Slf4j
public class HelloController {

    @GetMapping(value = "/hello")
    public String helloWorld() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        log.info("hello world {} !", LocalDateTime.now(ZoneOffset.of("+8")).format(formatter));
        return "hello world !";
    }

}
