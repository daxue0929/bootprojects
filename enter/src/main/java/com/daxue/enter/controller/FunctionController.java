package com.daxue.enter.controller;


import com.daxue.enter.entity.Group;
import com.daxue.enter.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/ajax/function")
public class FunctionController {

    @Autowired
    private GroupService manager;

    public List<Group> searchOne() {

        return manager.list();
    }
}
