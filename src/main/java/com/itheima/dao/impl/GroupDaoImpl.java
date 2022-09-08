package com.itheima.dao.impl;

import com.itheima.dao.DeptDao;
import com.itheima.dao.GroupDao;
import com.itheima.domain.Dept;
import com.itheima.domain.Group;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Component
@Scope("prototype")
public class GroupDaoImpl implements GroupDao {
    @Override
    public Group findById(Integer id) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        GroupDao mapper = sqlSession.getMapper(GroupDao.class);
        Group group = mapper.findById(id);
        sqlSession.close();
        return group;


    }

    @Override
    public List<Group> list() throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        GroupDao mapper = sqlSession.getMapper(GroupDao.class);
        List<Group> list = mapper.list();
        sqlSession.close();
        return list;
    }

    @Override
    public void del(Integer id) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        GroupDao mapper = sqlSession.getMapper(GroupDao.class);
         mapper.del(id);
         sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public void add(Map map) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        GroupDao mapper = sqlSession.getMapper(GroupDao.class);
        mapper.add(map);
        sqlSession.commit();
        sqlSession.close();
    }
}
