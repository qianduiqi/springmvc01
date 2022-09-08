package com.itheima.service.impl;

import com.itheima.dao.CityDao;
import com.itheima.domain.City;
import com.itheima.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
@Component
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;
    @Override
    public List<City> list() throws IOException {
        return cityDao.list();
    }

    @Override
    public void del(Integer id) throws IOException {
        cityDao.del(id);
    }

    @Override
    public void add(City city) throws IOException {
        cityDao.add(city);
    }

    @Override
    public void delMany(Integer[] ids) throws IOException {
        cityDao.delMany(ids);
    }
}
