package com.itheima.service;

import com.itheima.domain.User;

import java.io.IOException;

public interface UserService {
    User query(User user) throws IOException;

    void add(User user) throws IOException;

    void change(User user) throws IOException;
}
