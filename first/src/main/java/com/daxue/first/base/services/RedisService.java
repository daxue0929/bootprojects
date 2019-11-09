package com.daxue.first.base.services;

import com.daxue.utils.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    public RedisConfig redisUtils;



}
