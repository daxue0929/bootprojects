package com.daxue.enter.controller;


import com.daxue.enter.entity.Group;
import com.daxue.enter.service.GroupService;
import com.daxue.enter.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author daxue0929
 * @since 2019-11-25
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/ajax/group")
public class GroupController {

    @Autowired
    private GroupService manager;

    @GetMapping(value = "/list")
    public ResultData list() {
        ResultData resultData = new ResultData();

        List<Group> list = manager.list();
        resultData.setData(list);

        return resultData;
    }
}
