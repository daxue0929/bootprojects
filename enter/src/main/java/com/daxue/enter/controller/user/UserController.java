package com.daxue.enter.controller.user;

import com.daxue.enter.service.UserService;

import com.daxue.enter.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/ajax/user")
public class UserController {

    @Autowired
    private UserService manager;

    @Autowired
    ResultData result;

    @GetMapping("/selectById")
    public ResultData selectById(@RequestParam Integer id) {
        try {
            result.setData(manager.selectById(id));
            result.setCode(ResultData.SUCCESS);
        } catch (Exception e) {
            result.setDesc(e.getMessage());
        }
        return result;
    }
}
