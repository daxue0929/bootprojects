package com.daxue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableScheduling
public class AutoWechatSendApplication {
    public static void main( String[] args ) {
        SpringApplication.run(AutoWechatSendApplication.class, args);
    }
}
