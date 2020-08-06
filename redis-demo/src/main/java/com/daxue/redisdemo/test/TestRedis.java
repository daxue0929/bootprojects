package com.daxue.redisdemo.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @author Admin
 * @date 2020/08/07
 **/
@Configuration
@Slf4j
public class TestRedis {

    final RedisTemplate redisTemplate;

    public TestRedis(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Bean
    public void test1() {
        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
        opsForValue.set("testKey", "testValue");

        log.info(opsForValue.get("testKey"));

    }


}
