package com.daxue.first.services.impl;

import com.daxue.first.dao.UserMapper;
import com.daxue.first.pojo.User;
import com.daxue.first.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserMapper mapper;

    @Override
    public List<User> list() {
        return mapper.list();
    }
}
