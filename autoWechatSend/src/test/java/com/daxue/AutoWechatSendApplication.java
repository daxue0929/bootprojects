package com.daxue;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableScheduling
public class AutoWechatSendApplication {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
