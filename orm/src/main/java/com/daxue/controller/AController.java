package com.daxue.controller;

import com.daxue.dao.UserMapper;
import com.daxue.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AController {

    @Autowired
    UserMapper userDao;

    @GetMapping(value = "/a/mvUser")
    public List<User> redi() {
//        List<User> list = userDao.selectList(null);
        List<User> list1 = userDao.list();

        return list1;
    }
}
