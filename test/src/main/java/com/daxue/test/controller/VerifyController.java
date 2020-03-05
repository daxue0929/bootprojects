package com.daxue.test.controller;

import com.daxue.test.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 */
@RestController
public class VerifyController {

    Logger logger = LoggerFactory.getLogger(VerifyController.class);

    @Autowired
    public RedisUtil redisUtil;

    @PostMapping(value = "/getMsisdn")
    public String getMsisdn(@RequestBody EntityTest entityTest
    ) {

        redisUtil.setValue("entityTest", entityTest);
        logger.info(entityTest.toString());

        return "data:  " + entityTest.toString();
    }

    @PostMapping(value = "/test005")
    public String test005() {

        System.out.println("进来测试方法");
        return "后端返回的数据";
    }
}
