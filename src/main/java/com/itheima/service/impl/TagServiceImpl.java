package com.itheima.service.impl;

import com.itheima.dao.TagDao;
import com.itheima.domain.Tag;
import com.itheima.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
@Component
public class TagServiceImpl implements TagService {
    @Autowired
    private TagDao tagDao;
    @Override
    public List<Tag> list() throws IOException {
        return tagDao.list();

    }

    @Override
    public void del(Integer id) throws IOException {
         tagDao.del(id);
    }

    @Override
    public void add(Tag tag) throws IOException {
        tagDao.add(tag);
    }
}
