package com.daxue.first.controller;

import com.daxue.first.model.User;
import com.daxue.first.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public List<User> getStuinforList(){
        List<User> list=userService.getList();

        System.out.println(list);
        return list;
    }

}
