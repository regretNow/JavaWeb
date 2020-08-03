package com.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Response extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(resp.getCharacterEncoding());//默认ISO-8859-1(单字节编码)
//        resp.setCharacterEncoding("utf-8");
//        resp.setHeader("Content-Type","text/html; charset=utf-8");
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.write("测试中.........");
    }
}
