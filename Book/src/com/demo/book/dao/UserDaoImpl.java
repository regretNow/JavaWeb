package com.demo.book.dao;

import com.demo.book.dao.impl.BaseBao;
import com.demo.book.pojo.User;

public class UserDaoImpl extends BaseBao implements UserDao {

    @Override
    public User queryUserByUsername(String username) {
        String sql  = "select * from t_user where username = ?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select * from t_user where username = ? and password = ?";
        return queryForOne(User.class,sql,username,password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into t_user(`username`,`password`,`email`) values (?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }
}
