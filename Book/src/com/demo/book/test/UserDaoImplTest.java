package com.demo.book.test;


import com.demo.book.dao.UserDao;
import com.demo.book.dao.UserDaoImpl;
import com.demo.book.pojo.User;
import org.junit.Test;

import java.sql.SQLOutput;

public class UserDaoImplTest {

    @Test
    public void queryUserByUsername() {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.queryUserByUsername("user"));
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.queryUserByUsernameAndPassword("admin","a1dmin"));
    }

    @Test
    public void saveUser() {
        UserDao  userDao = new UserDaoImpl();
        User user = new User(null,"user","user","123@qq.com");
        System.out.println(userDao.saveUser(user));
    }
}