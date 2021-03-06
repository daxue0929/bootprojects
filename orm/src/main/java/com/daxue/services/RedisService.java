package com.daxue.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisService {


    @Autowired
    public RedisTemplate redisTemplate;


    public String hello() {
        ValueOperations valueOperations = redisTemplate.opsForValue();

        valueOperations.set("a", "hello world !");


        return (String) valueOperations.get("a");
    }
}
