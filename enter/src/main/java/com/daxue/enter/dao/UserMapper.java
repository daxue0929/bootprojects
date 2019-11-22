package com.daxue.enter.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.daxue.enter.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
}
