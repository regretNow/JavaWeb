package com.demo.book.web;

import com.demo.book.pojo.User;
import com.demo.book.service.UserService;
import com.demo.book.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User login = userService.login(new User(null, username, password, null));

        if(login!=null){
            req.getRequestDispatcher("/pages/user/login_success.html").forward(req,resp);
        }else{
            req.getRequestDispatcher("/pages/user/login.html").forward(req,resp);
        }
    }
}
