package com.demo.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloServlet implements Servlet {

    public HelloServlet() {
        System.out.println("1 构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2 init初始化办法");
//        1、可以获取Servlet程序的别名servlet-name的值
        System.out.println("HelloServlet程序的别名是:"+servletConfig.getServletName());
//        2、获取初始化参数init-param
        System.out.println("初始化参数username的值是:"+servletConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是:"+servletConfig.getInitParameter("url"));
//       3、获取ServletContext对象
        System.out.println(servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {


        //向下类型转换
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        String method = httpServletRequest.getMethod();

        if(method.equals("GET")){
            doGet();
        }else if(method.equals("POST")){
            doPost();
        }
    }

    public void doGet(){
        System.out.println("Get请求");
    }

    public void doPost(){
        System.out.println("Post请求");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
