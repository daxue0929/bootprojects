package com.daxue.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test001() {
        String s = "{\"inresponseto\":\"msgId\",\"systemtime\":\"20191118112006062\",\"resultcode\":\"103000\",\"msisdn\":\"17344615861\",\"taskId\":\"ade99544c80f4a3bbfcdfd40559b5b6c\"}{\"inresponseto\":\"\",\"systemtime\":\"\",\"resultcode\":\"\",\"msisdn\":\"\",\"taskId\":\"\"}";

        System.out.println(s);


    }

}
