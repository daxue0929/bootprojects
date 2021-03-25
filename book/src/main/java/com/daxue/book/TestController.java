package com.daxue.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author daxue0929
 * @date 2021/03/25
 **/
@RestController
public class TestController {

    @Autowired
    private Environment environment;

    @GetMapping
    public String hello() {
        return environment.getProperty("server.port");
    }

    @Value("${server.port}")
    public String port;

    @GetMapping
    public String hello_2() {
        // 传统实现线程的方式
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(()-> {
            try {



            }catch (Exception e) {
                e.printStackTrace();
            }
        });


        return environment.getProperty("server.port");
    }



}
