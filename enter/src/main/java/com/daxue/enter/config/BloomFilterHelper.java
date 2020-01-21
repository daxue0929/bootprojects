package com.daxue.enter.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.daxue.enter.entity.User;
import com.daxue.enter.mapper.UserMapper;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnel;
import com.google.common.hash.Funnels;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.List;

public class BloomFilterHelper<S> {

    @Autowired
    private UserMapper userMapper;

    private BloomFilter<Integer> bf;

    /**
     * 创建布隆过滤器
     *
     * @PostConstruct：程序启动时候加载此方法
     */
    @PostConstruct
    public void initBloomFilter() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        List<User> userList = userMapper.selectList(userQueryWrapper);
        if (CollectionUtils.isEmpty(userList)) {
            return;
        }
        //创建布隆过滤器(默认3%误差)
        bf = BloomFilter.create(Funnels.integerFunnel(), userList.size());
        for (User user : userList) {
            bf.put(user.getId());
        }
    }

    /**
     * 判断id可能存在于布隆过滤器里面
     *
     * @param id
     * @return
     */
    public boolean userIdExists(int id) {
        return bf.mightContain(id);
    }
}
