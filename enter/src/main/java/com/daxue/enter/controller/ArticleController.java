package com.daxue.enter.controller;


import com.daxue.enter.entity.Article;
import com.daxue.enter.service.impl.ArticleServiceImpl;
import com.daxue.enter.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author daxue0929
 * @since 2019-12-01
 */
@CrossOrigin
@RestController
@RequestMapping("/ajax/article")
public class ArticleController {

    @Autowired
    private ArticleServiceImpl manager;


    @PostMapping(value = "/save")
    public ResultData save() {

        Article entity = new Article();

        entity.setContent("真正的博客内容");
        entity.setTime(new Date());



        ResultData resultData = new ResultData();

        boolean save = manager.save(entity);
        if (save){
            resultData.setCode(ResultData.SUCCESS);
        }

        return resultData;
    }


    @GetMapping(value = "/list")
    public ResultData list() {
        ResultData resultData = new ResultData();


        resultData.setCode(ResultData.SUCCESS);
        resultData.setData(manager.list());
        return resultData;
    }



}
