package com.daxue.test.A;

import com.daxue.test.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangxuedi
 * Date: 2020/4/16 9:15
 * describe:
 */
@Configuration
public class TestRedis {

    @Autowired
    RedisUtils redisUtils;

    public String hashKey="hashKey";

    @Bean
    public void test1() {
        redisUtils.set("user", new User(1, "daxue", 23));

        User user =(User) redisUtils.get("user");
        System.out.println(user.getClass().getTypeName());

        redisUtils.hset(hashKey, "da", user);

        Object value = redisUtils.hget(hashKey, "da");
        System.out.println(value.getClass().getTypeName());

    }




}
