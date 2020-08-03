package com.demo.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Forward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Forward 在这里被调用");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/a/b/c.html");
        requestDispatcher.forward(req,resp);
    }
}
