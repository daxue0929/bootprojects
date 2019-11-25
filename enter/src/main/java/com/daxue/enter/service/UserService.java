package com.daxue.enter.service;

import com.daxue.enter.mapper.UserMapper;
import com.daxue.enter.entity.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public UserMapper userDao;

    Logger logger = LoggerFactory.getLogger(UserService.class);

    public User selectById(Integer id) {
        User user = userDao.selectById(id);
        return user;
    }

    public boolean deleteById(Integer id) {
        return userDao.deleteById(id) > 0 ? true : false;
    }

    public boolean insert(User entity) {
        return userDao.insert(entity) > 0 ? true : false;
    }

    public boolean updateById(User entity) {
        if (entity.getId() != null) {
            return userDao.updateById(entity) > 0 ? true : false;
        }
        logger.error(entity.toString());
        return false;
    }


}
