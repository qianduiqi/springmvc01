package com.itheima.dao;

import com.itheima.domain.Empl;
import com.itheima.domain.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;

public interface EmplDao {
    List<Empl> list(int start,String name) throws IOException;

    void change(Empl empl) throws IOException;

    void del(Integer eid) throws IOException;

    void add(Empl empl) throws IOException;
    void addTest(Empl empl,Integer deptId) throws IOException;

    int getTotalCount(String name) throws IOException;


    List<Tag> queryTag() throws IOException;

    void addRel(Integer id, Integer tagId) throws IOException;


}
