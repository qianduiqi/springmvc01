package com.itheima.dao;

import com.itheima.domain.City;

import java.io.IOException;
import java.util.List;

public interface CityDao {


    List<City> list() throws IOException;

    void del(Integer id) throws IOException;

    void add(City city) throws IOException;

    City findById(Integer cityId) throws IOException;

    void delMany(Integer[] ids) throws IOException;
}
