package com.daxue.test.config;

import com.daxue.test.utils.RedisUtil;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Data
@Component
public class Keys {

    @Autowired
    RedisUtil redisUtil;

    private final static String KEY = "key";

    public Set keys;

    /**
     * search current the key content when every get keys
     * @return
     */
    public Set getKeys() {
        this.keys = redisUtil.getAllSet(KEY);
        return keys;
    }
}
