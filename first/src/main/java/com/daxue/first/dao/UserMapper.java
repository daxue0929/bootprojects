package com.daxue.first.dao;

import com.daxue.first.base.dao.BaseMapper;
import com.daxue.first.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
