package com.daxue.enter.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.daxue.enter.entity.Article;
import com.daxue.enter.mapper.ArticleMapper;
import com.daxue.enter.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author daxue0929
 * @since 2019-12-01
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {


    @Autowired
    private ArticleMapper mapper;

    @Override
    public boolean saveBatch(Collection<Article> entityList) {
        return false;
    }


    @Override
    public List<Article> list(Wrapper<Article> queryWrapper) {
        return super.list(queryWrapper);
    }

    public List<Article> list() {
        return mapper.list();
    }
}
