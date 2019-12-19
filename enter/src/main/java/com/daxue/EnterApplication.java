package com.daxue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class EnterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterApplication.class, args);
    }
}

/**
 *
 * 1. YAML 无法使用 @PropertySource 注解加载YAML文件
 *
 * 2. 开发项目之前，频繁的在项目环境之间切换，这个时候有大量的配置需要更改
 *    例如数据库配置，redis配置，mongodb配置，jms配置
 *
 *
 */
