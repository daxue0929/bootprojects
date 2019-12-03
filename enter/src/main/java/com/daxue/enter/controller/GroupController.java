package com.daxue.enter.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/ajax/group")
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
