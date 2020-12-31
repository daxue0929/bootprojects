package com.wang.service;

import com.wang.dao.SysUserDao;
import com.wang.dao.impl.SysUserDaoImpl;
import com.wang.pojo.SysUser;

import java.sql.SQLException;

public class SysUserService {
    private SysUserDao dao;

    /**
     * static code
     */
    {
        dao = new SysUserDaoImpl();
    }

    public SysUser getOne(Integer id) {
        SysUser sysUser = new SysUser();
        try {
            sysUser = dao.selectOne(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return sysUser;
    }

}
