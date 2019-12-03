package com.daxue.enter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.daxue.enter.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author daxue0929
 * @since 2019-12-01
 */

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

    public List<Article> list();

}
