package com.daxue.first.dao;

import com.daxue.first.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getList();
}