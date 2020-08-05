package com.daxue.first.controller;

import com.daxue.first.pojo.User;
import com.daxue.first.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@CrossOrigin
public class UserController {

    @Autowired
    public UserService userService;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/")
    @ResponseBody
    public List<User> getStuinforList(){
        List<User> list = userService.list();

        logger.info("有一人请求了用户接口");

        System.out.println(list);
        return list;
    }

}
