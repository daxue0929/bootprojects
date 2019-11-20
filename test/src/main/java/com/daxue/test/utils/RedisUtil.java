package com.daxue.test.utils;

import com.daxue.test.config.RedisEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate redisTemplate;

    private StringRedisTemplate stringRedisTemplate;

    /**
     * @param key
     *          键
     * @param time
     *          时间
     * @param redisEnum
     *          指定time是时分秒天的哪一种
     * @return
     */
    public boolean expire(String key, long time, RedisEnum redisEnum) {
        try {
            if (time > 0) {
                if (RedisEnum.DAYS == redisEnum) {
                    redisTemplate.expire(key, time, TimeUnit.DAYS);
                } else if (RedisEnum.SECONDS == redisEnum) {
                    redisTemplate.expire(key, time, TimeUnit.SECONDS);
                } else if (RedisEnum.MINUTES == redisEnum) {
                    redisTemplate.expire(key, time, TimeUnit.MINUTES);
                } else if (RedisEnum.HOURS == redisEnum) {
                    redisTemplate.expire(key, time, TimeUnit.HOURS);
                }
            }
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @param key
     *          键
     * @param time
     *          时间(秒)
     * @return
     */
    public boolean expire(String key, long time) {
        try {
            if (time > 0) {
                redisTemplate.expire(key, time, TimeUnit.SECONDS);
            }
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    /**
     * 根据key 获取过期时间
     *
     * @param key
     *            键 不能为null
     * @return 时间(秒) 返回0代表为永久有效
     */
    public long getExpire(String key) {
        return redisTemplate.getExpire(key, TimeUnit.SECONDS);
    }

    /**
     * 判断key是否存在
     *
     * @param key
     *            键
     * @return true 存在 false不存在
     */
    public boolean hasKey(String key) {
        try {
            return redisTemplate.hasKey(key);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    /**
     * 删除键
     * @param key
     *            可以传一个键 或多个
     */
    @SuppressWarnings("unchecked")
    public void delKeys(String... key) {
        if (key != null && key.length > 0) {
            if (key.length == 1) {
                redisTemplate.delete(key[0]);
            } else {
                redisTemplate.delete(CollectionUtils.arrayToList(key));
            }
        }
    }

    /**
     * 获取string类型数据
     * @param key
     *          键
     * @return  null/值
     */
    public Object getValue(String key) {
        return key == null ? null : redisTemplate.opsForValue();
    }

    /**
     * 存入String类型数据,不设置失效时间（即永久有效）
     *
     * @param key
     *            键
     * @param value
     *            值
     * @return true成功 false失败
     */
    public boolean setValue(String key, Object value) {
        try {
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }


    /**
     * 存入String类型数据并设置时间
     *
     * @param key
     *            键
     * @param value
     *            值
     * @param time
     *            时间(秒) time要大于0 如果time小于等于0 将设置无限期
     * @return true成功 false 失败
     */
    public boolean setValue(String key, Object value, long time) {
        try {
            if (time > 0) {
                redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
            } else {
                setValue(key, value);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    /**
     * 往键为key的列表最右边添加一个值
     * @param key
     *          key
     * @param value
     *          值
     * @return
     */
    public boolean appendList(String key, Object value) {
        try {
            redisTemplate.opsForList().rightPush(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 完整的获取整个key的列表
     * @param key
     * @return
     */
    public List getAllList(String key) {
        return redisTemplate.opsForList().range(key, 0, redisTemplate.opsForList().size(key));
    }



    /**
     * add the value or much value to the set of this key
     * @param key
     * @param value
     * @return
     */
    public boolean addSet(String key, Object ...value) {
        try {
            redisTemplate.opsForSet().add(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * about set: get all list of the key
     * @param key
     * @return
     */
    public Set getAllSet(String key) {
        return redisTemplate.opsForSet().members(key);
    }
}
