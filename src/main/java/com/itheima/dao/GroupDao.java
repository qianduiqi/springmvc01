package com.itheima.dao;

import com.itheima.domain.Group;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface GroupDao {

    Group findById(Integer id) throws IOException;


    List<Group> list() throws IOException;

    void del(Integer id) throws IOException;

    void add(Map map) throws IOException;
}
