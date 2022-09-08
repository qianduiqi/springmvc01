package com.itheima.service;

import com.itheima.domain.City;

import java.io.IOException;
import java.util.List;

public interface CityService {
    List<City> list() throws IOException;

    void del(Integer id) throws IOException;

    void add(City city) throws IOException;

    void delMany(Integer[] ids) throws IOException;
}
