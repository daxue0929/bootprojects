package com.wang.controller;

import com.alibaba.fastjson.JSONObject;
import com.wang.pojo.SysUser;
import com.wang.service.SysUserService;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.wang.utils.GlobalUtil.toJson;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    private SysUserService userService;

    {
        userService = new SysUserService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        SysUser one = userService.getOne(id);

        req.setAttribute("user", one);

        req.getRequestDispatcher("/user.jsp").forward(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("content-type", "application/json; charset=UTF-8");


        SysUser one = userService.getOne(1);
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.write(toJson(one).getBytes("UTF-8"));
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }


    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
