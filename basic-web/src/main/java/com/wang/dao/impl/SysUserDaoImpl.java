package com.wang.dao.impl;

import com.wang.dao.SysUserDao;
import com.wang.pojo.SysUser;
import com.wang.utils.DbSourceUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SysUserDaoImpl implements SysUserDao {

    private Connection connection = null;

    /**
     * static codes
     */
    {
        connection = DbSourceUtils.getConnection();
    }

    @Override
    public SysUser selectOne(Integer id) throws SQLException {
        SysUser sysUser = new SysUser();
        Statement statement = connection.createStatement();
        String sql = "select id, name, password, email, phone," +
                "createTime, updateTime,account,description from sys_user where id = " + id;
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            sysUser.setId(rs.getInt("id"));
            sysUser.setName(rs.getString("name"));
            sysUser.setPassword(rs.getString("password"));
            sysUser.setEmail(rs.getString("email"));
            sysUser.setPhone(rs.getString("phone"));
            sysUser.setCreatetime(rs.getTimestamp("createTime"));
            sysUser.setUpdatetime(rs.getTimestamp("updateTime"));
            sysUser.setAccount(rs.getString("account"));
            sysUser.setDescription(rs.getString("description"));
        }
        return sysUser;
    }

    @Test
    public void selectOneTest() throws SQLException {
        SysUserDaoImpl dao = new SysUserDaoImpl();
        dao.selectOne(1);
    }


}
