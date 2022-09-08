package com.itheima.service.impl;

import com.itheima.dao.DeptDao;
import com.itheima.dao.GroupDao;
import com.itheima.domain.City;
import com.itheima.domain.Dept;
import com.itheima.domain.Group;
import com.itheima.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupDao groupDao;
    @Autowired
    private DeptDao deptDao;
    @Override
    public List<Group> list() throws IOException {
        List<Group> groupList=groupDao.list();
        for (Group group : groupList) {
            Integer id = group.getDeptId();
            Dept dept=deptDao.findById(id);
            group.setDept(dept);
      }
        return groupList;
    }

    @Override
    public void del(Integer id) throws IOException {
groupDao.del(id);
    }

    @Override
    public void add(Group group, String deptName) throws IOException {
        Map<String,Object> params=new HashMap<String,Object>();

        Dept dept=deptDao.findIdByName(deptName);
        Integer deptId = dept.getId();
        String name = group.getName();
        Date birth = group.getBirth();


        params.put("name",name);
        params.put("birth",birth);
        params.put("deptId",deptId);


        groupDao.add(params);


    }
}
