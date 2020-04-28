package com.daxue.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxuedi
 * Date: 2020/4/28 13:53
 * describe:
 */
@RestController
@Slf4j
public class TT {

    public volatile int count = 0;

    @GetMapping(value = "test")
    public String test() {



      log.info("请求的次数：{}", count++);

        return "测试的接口："+count;
    }

}
