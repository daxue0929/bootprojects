package com.daxue.first.base.dao;

import java.util.List;

/**
 * 增删改查 四个基本方法接口
 * @param <T>
 */
public interface BaseMapper<T> {
    /**
     * 查询数据集合
     * @return
     */
    public List<T> list();

    /**
     * 查询某一个记录
     * @param id Integer
     * @return 相应的对象
     */
    public T get(Integer id);

    /**
     * 删除一个记录
     * @param id
     * @return true/false
     */
    public boolean delete(Integer id);

    /**
     * 更新一个值
     * @param id
     * @return
     */
    public boolean update(Integer id);
}
