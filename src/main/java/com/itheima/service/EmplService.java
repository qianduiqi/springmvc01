package com.itheima.service;

import com.itheima.domain.Empl;
import com.itheima.domain.Tag;
import com.itheima.util.PageInfo;

import java.io.IOException;
import java.util.List;

public interface EmplService {
    PageInfo<Empl> list(int currentPage,String name) throws IOException;

    void change(Empl empl) throws IOException;

    void del(Integer eid) throws IOException;

    void add(Empl empl,Integer[] tagIds) throws IOException;

    List<Tag> queryTag() throws IOException;
}
