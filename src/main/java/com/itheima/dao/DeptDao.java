package com.itheima.dao;

import com.itheima.domain.Dept;

import java.io.IOException;
import java.util.List;

public interface DeptDao {
    Dept findById(Integer id) throws IOException;

    Dept findIdByName(String deptName) throws IOException;

    void add(Dept dept) throws IOException;

    List<Dept> list() throws IOException;

    void del(Integer id) throws IOException;
}
