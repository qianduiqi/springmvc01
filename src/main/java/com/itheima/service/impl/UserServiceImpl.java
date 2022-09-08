package com.itheima.service.impl;


import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User query(User user) throws IOException {

        return userDao.query(user);
    }

    @Override
    public void add(User user) throws IOException {
        userDao.add(user);
    }

    @Override
    public void change(User user) throws IOException {
        userDao.change(user);
    }
}
