package com.itheima.dao.impl;

import com.itheima.dao.DeptDao;
import com.itheima.dao.EmplDao;
import com.itheima.domain.Dept;
import com.itheima.domain.Empl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
@Scope("prototype")
public class DeptDaoImpl implements DeptDao {
    @Override
    public Dept findById(Integer id) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DeptDao mapper = sqlSession.getMapper(DeptDao.class);
        Dept dept = mapper.findById(id);
        sqlSession.close();
        return dept;

    }

    @Override
    public Dept findIdByName(String deptName) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DeptDao mapper = sqlSession.getMapper(DeptDao.class);
        Dept dept = mapper.findIdByName(deptName);
        sqlSession.close();
        return dept;

    }

    @Override
    public void add(Dept dept) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DeptDao mapper = sqlSession.getMapper(DeptDao.class);
        mapper.add(dept);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public List<Dept> list() throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DeptDao mapper = sqlSession.getMapper(DeptDao.class);
        List<Dept> list = mapper.list();

        sqlSession.close();
        return list;
    }

    @Override
    public void del(Integer id) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DeptDao mapper = sqlSession.getMapper(DeptDao.class);
        mapper.del(id);
sqlSession.commit();
        sqlSession.close();

    }
}
