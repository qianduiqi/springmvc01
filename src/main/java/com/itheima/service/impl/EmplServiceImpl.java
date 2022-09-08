package com.itheima.service.impl;

import com.itheima.dao.*;
import com.itheima.domain.*;
import com.itheima.service.EmplService;
import com.itheima.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
@Component
public class EmplServiceImpl  implements EmplService {
    @Autowired
   private CityDao cityDao;
    @Autowired
    private GroupDao groupDao;
    @Autowired
    private TagDao tagDao;
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private EmplDao emplDao;
    @Override
    public PageInfo<Empl> list(int currentPage,String name) throws IOException {
        PageInfo<Empl> pageInfo=new PageInfo<>();
        pageInfo.setSize(5);
        //根据查询的名字来获取总条数
        int tc=emplDao.getTotalCount(name);
        //在pageInfo对象中设置总条数
        pageInfo.setTotalCount(tc);
        //计算总页数
        int tp= (int) Math.ceil(tc/5.0);
        pageInfo.setTotalPage(tp);
        if(currentPage<1){
            pageInfo.setCurrentPage(1);
        }
        else if(currentPage>tp){
            pageInfo.setCurrentPage(tp);
        }else {
            pageInfo.setCurrentPage(currentPage);
        }
        int start=(pageInfo.getCurrentPage()-1)*5;


        List<Empl> emplList=  emplDao.list(start,name);
        for (Empl empl : emplList) {
            Integer cityId = empl.getCityId();
            City city=cityDao.findById(cityId);
            empl.setCity(city);
            //根据id得到部门名
            Integer deptId = empl.getDeptId();
            Dept dept=deptDao.findById(deptId);

            empl.setDept(dept);
            //根据id去得到小组名
            Integer groupId = empl.getGroupId();
            Group group=groupDao.findById(groupId);


            empl.setGroup(group);
            //根据id得到标签
            Integer id= empl.getId();
            List<Tag> tag=tagDao.findById(id);
            empl.setTagList(tag);


       }
        pageInfo.setList(emplList);
      return pageInfo;
    }



    @Override
    public void change(Empl empl) throws IOException {
        emplDao.change(empl);
    }

    @Override
    public void del(Integer eid) throws IOException {
        emplDao.del(eid);
    }

    @Override
    public void add(Empl empl,Integer[] tagIds) throws IOException {
        emplDao.add(empl);
        Integer id = empl.getId();
        for (Integer tagId : tagIds) {
            emplDao.addRel(id,tagId);
        }



    }

    @Override
    public List<Tag> queryTag() throws IOException {
        return emplDao.queryTag();
    }
}
