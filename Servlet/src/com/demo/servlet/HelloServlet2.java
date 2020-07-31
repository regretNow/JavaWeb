package com.demo.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet2 extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
//        1、可以获取Servlet程序的别名servlet-name的值
        System.out.println("HelloServlet程序的别名是:"+servletConfig.getServletName());
//        2、获取初始化参数init-param
        System.out.println("初始化参数username的值是:"+servletConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是:"+servletConfig.getInitParameter("url"));
//       3、获取ServletContext对象
        System.out.println(servletConfig.getServletContext());
        System.out.println("get请求");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
//        1、可以获取Servlet程序的别名servlet-name的值
        System.out.println("HelloServlet程序的别名是:"+servletConfig.getServletName());
//        2、获取初始化参数init-param
        System.out.println("初始化参数username的值是:"+servletConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是:"+servletConfig.getInitParameter("url"));
//       3、获取ServletContext对象
        System.out.println(servletConfig.getServletContext());
        System.out.println("post请求");
    }
}
