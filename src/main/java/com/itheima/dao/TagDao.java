package com.itheima.dao;

import com.itheima.domain.Tag;

import java.io.IOException;
import java.util.List;

public interface TagDao {
    List<Tag> findById(Integer id) throws IOException;

    List<Tag> list() throws IOException;

    void del(Integer id) throws IOException;

    void add(Tag tag) throws IOException;
}
