package com.daxue.enter.service;

import com.daxue.enter.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author daxue0929
 * @since 2019-12-01
 */
public interface ArticleService extends IService<Article> {
    List<Article> list();
}
