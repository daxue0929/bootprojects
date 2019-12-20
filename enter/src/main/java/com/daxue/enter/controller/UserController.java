package com.daxue.enter.controller;

import com.daxue.enter.service.UserService;
import com.daxue.enter.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping(value = "/ajax/user")
public class UserController {

    @Autowired
    private UserService manager;

    @Autowired
    ResultData result;

    @GetMapping("/getById")
    public ResultData getById(@RequestParam Integer id) {
        try {
            result.setData(manager.selectById(id));
            result.setCode(ResultData.SUCCESS);
        } catch (Exception e) {
            result.setDesc(e.getMessage());
        }
        return result;
    }


}
