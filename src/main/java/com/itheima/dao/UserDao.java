package com.itheima.dao;

import com.itheima.domain.User;

import java.io.IOException;

public interface UserDao {


    User query(User user) throws IOException;

    void add(User user) throws IOException;

    void change(User user) throws IOException;
}
