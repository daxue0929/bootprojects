package com.daxue.first.services.impl;

import com.daxue.first.dao.UserMapper;
import com.daxue.first.model.User;
import com.daxue.first.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getList() {
        return userMapper.getList();
    }

    @Override
    public List<User> list() {

        //周五晚上从这里开始

        return null;
    }
}
