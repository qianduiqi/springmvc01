package com.itheima.dao.impl;

import com.itheima.dao.EmplDao;
import com.itheima.dao.UserDao;
import com.itheima.domain.Empl;
import com.itheima.domain.Tag;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@Component
public class EmplDaoImpl implements EmplDao {

    @Override
    public List<Empl> list(int start, String name) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmplDao mapper = sqlSession.getMapper(EmplDao.class);
        List<Empl> emplList = mapper.list(start,name);
        sqlSession.close();
        return emplList;

    }


    @Override
    public void change(Empl empl) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmplDao mapper = sqlSession.getMapper(EmplDao.class);
        mapper.change(empl);
        sqlSession.commit();
        sqlSession.close();


    }

    @Override
    public void del(Integer eid) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmplDao mapper = sqlSession.getMapper(EmplDao.class);
        mapper.del(eid);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void add(Empl empl) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmplDao mapper = sqlSession.getMapper(EmplDao.class);
        mapper.add(empl);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void addTest(Empl empl, Integer deptId) throws IOException {

    }

    @Override
    public int getTotalCount(String name) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmplDao mapper = sqlSession.getMapper(EmplDao.class);
       int a = mapper.getTotalCount(name);
        sqlSession.close();
        return a;

    }

    @Override
    public List<Tag> queryTag() throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmplDao mapper = sqlSession.getMapper(EmplDao.class);
        List<Tag> tags = mapper.queryTag();
        sqlSession.close();
        return tags;
    }

    @Override
    public void addRel(Integer id, Integer tagId) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmplDao mapper = sqlSession.getMapper(EmplDao.class);
        mapper.addRel(id,tagId);
        sqlSession.commit();
        sqlSession.close();

    }


}
