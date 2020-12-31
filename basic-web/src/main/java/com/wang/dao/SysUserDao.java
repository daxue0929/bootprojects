package com.wang.dao;

import com.wang.pojo.SysUser;

import java.sql.SQLException;

public interface SysUserDao {
    SysUser selectOne(Integer id) throws SQLException;
}
