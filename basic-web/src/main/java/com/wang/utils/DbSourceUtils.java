package com.wang.utils;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.function.DoubleBinaryOperator;

public class DbSourceUtils {
    public static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            String driverClass = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "root";
            String url = "jdbc:mysql://39.107.127.218:3306/tool?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=false";
            try {
                Class.forName(driverClass);
                connection = DriverManager.getConnection(url, userName, password);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

//    @Test
    public void getConnectTest() throws SQLException {

        Connection connection = DbSourceUtils.getConnection();
        DbSourceUtils.getConnection();
    }

    public static void setConnection(final Connection connection) {
        DbSourceUtils.connection = connection;
    }

}
