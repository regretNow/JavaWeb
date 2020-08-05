package com.demo.book.service.impl;

import com.demo.book.dao.UserDao;
import com.demo.book.dao.UserDaoImpl;
import com.demo.book.pojo.User;
import com.demo.book.service.UserService;

public class UserServiceImpl implements UserService{

    private UserDao userDao  = new UserDaoImpl();

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public int register(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public Boolean isExistUserName(String name) {
        User user = userDao.queryUserByUsername(name);
        if(user!=null){
            return true;
        }else{
            return false;
        }
    }

}