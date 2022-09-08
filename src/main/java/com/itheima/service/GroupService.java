package com.itheima.service;

import com.itheima.domain.City;
import com.itheima.domain.Group;

import java.io.IOException;
import java.util.List;

public interface GroupService {
    List<Group> list() throws IOException;

    void del(Integer id) throws IOException;

    void add(Group group, String deptName) throws IOException;
}
