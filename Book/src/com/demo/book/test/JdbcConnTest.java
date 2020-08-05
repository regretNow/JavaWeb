package com.demo.book.test;


import com.demo.book.utils.JdbcUtils;
import org.junit.Test;


public class JdbcConnTest {
    @Test
    public void  testJdbcUtils(){
        System.out.println(JdbcUtils.getConnection());
    }
}
