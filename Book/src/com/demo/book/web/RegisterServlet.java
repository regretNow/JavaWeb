package com.demo.book.web;

import com.demo.book.dao.UserDao;
import com.demo.book.dao.UserDaoImpl;
import com.demo.book.pojo.User;
import com.demo.book.service.UserService;
import com.demo.book.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //第一步获取所有的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");
        //第二步校验验证码(忽略大小写)
        if(code.equalsIgnoreCase("abcd")){
            Boolean existUserName = userService.isExistUserName(username);
            if(existUserName){
                System.out.println("用户名[ "+username+" ]已存在!");
                req.getRequestDispatcher("/pages/user/regist.html").forward(req,resp);
            }else{
                userService.register(new User(null,username,password,email));
                req.getRequestDispatcher("/pages/user/regist_success.html").forward(req,resp);
            }
        }else{
            System.out.println("验证码[ "+code+" ]错误");
            req.getRequestDispatcher("/pages/user/regist.html").forward(req,resp);
        }
    }
}
