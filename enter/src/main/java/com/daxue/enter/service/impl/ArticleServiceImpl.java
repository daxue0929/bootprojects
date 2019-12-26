package com.daxue.enter.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.daxue.enter.entity.Article;
import com.daxue.enter.mapper.ArticleMapper;
import com.daxue.enter.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

    /**
     * 在一个事务中调用另一个事务 方法测试
     */
    @Transactional
    public void doSomeThing() {

        // 调用插入数据库的事务
        ((ArticleServiceImpl) AopContext.currentProxy()).insert();

        // 调用其他系统
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insert() {
        // 数据库事务写入操作
    }
}
