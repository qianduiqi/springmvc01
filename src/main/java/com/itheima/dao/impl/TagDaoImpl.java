package com.itheima.dao.impl;

import com.itheima.dao.DeptDao;
import com.itheima.dao.TagDao;
import com.itheima.domain.Dept;
import com.itheima.domain.Tag;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@Component
public class TagDaoImpl implements TagDao {
    @Override
    public List<Tag> findById(Integer id) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TagDao mapper = sqlSession.getMapper(TagDao.class);
        List<Tag> dept = mapper.findById(id);
        sqlSession.close();
        return dept;
    }

    @Override
    public List<Tag> list() throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TagDao mapper = sqlSession.getMapper(TagDao.class);
        List<Tag> list = mapper.list();
        sqlSession.close();
        return list;

    }

    @Override
    public void del(Integer id) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TagDao mapper = sqlSession.getMapper(TagDao.class);
   mapper.del(id);
   sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public void add(Tag tag) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TagDao mapper = sqlSession.getMapper(TagDao.class);
        mapper.add(tag);
        sqlSession.commit();
        sqlSession.close();
    }
}