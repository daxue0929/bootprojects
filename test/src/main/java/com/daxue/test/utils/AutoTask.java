package com.daxue.test.utils;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AutoTask {

    @Scheduled(cron = "0 0 0 * * ?") //表示要定时执行该方法,每天执行一次
    void execute(){
        System.out.println("SpringBoot Job Execute..."+ new Date());
    }

}
