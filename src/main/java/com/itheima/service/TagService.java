package com.itheima.service;

import com.itheima.domain.Tag;

import java.io.IOException;
import java.util.List;

public interface TagService {
    List<Tag> list() throws IOException;

    void del(Integer id) throws IOException;

    void add(Tag tag) throws IOException;
}
