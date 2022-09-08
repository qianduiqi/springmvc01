package com.itheima.dao.impl;

import com.itheima.dao.CityDao;
import com.itheima.dao.DeptDao;
import com.itheima.domain.City;
import com.itheima.domain.Dept;
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
public class CityDaoImpl implements CityDao {


    @Override
    public List<City> list() throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CityDao mapper = sqlSession.getMapper(CityDao.class);
        List<City> dept = mapper.list();
        sqlSession.close();
        return dept;
    }

    @Override
    public void del(Integer id) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CityDao mapper = sqlSession.getMapper(CityDao.class);
        mapper.del(id);
        sqlSession.commit();
        sqlSession.close();


    }

    @Override
    public void add(City city) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CityDao mapper = sqlSession.getMapper(CityDao.class);
        mapper.add(city);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public City findById(Integer cityId) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CityDao mapper = sqlSession.getMapper(CityDao.class);
        City city= mapper.findById(cityId);

        sqlSession.close();
        return city;
    }

    @Override
    public void delMany(Integer[] ids) throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CityDao mapper = sqlSession.getMapper(CityDao.class);
        mapper.delMany(ids);
        sqlSession.commit();

        sqlSession.close();

    }
}
