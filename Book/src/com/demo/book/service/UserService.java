package com.demo.book.service;

import com.demo.book.pojo.User;

public interface UserService {

    public User login(User user);

    public int register(User user);

    public Boolean isExistUserName(String username);
}
