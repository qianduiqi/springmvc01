package com.itheima.service.impl;

import com.itheima.dao.DeptDao;
import com.itheima.domain.Dept;
import com.itheima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Component
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;


    @Override
    public void add(MultipartFile file, Dept dept) throws IOException {
String filePath="D:\\ideaworkspace\\MySpringProject\\src\\main\\webapp\\img";
        String originalFilename = file.getOriginalFilename();
        String newFileName= UUID.randomUUID()+originalFilename;
        File targetFile=new File(filePath,newFileName);
        file.transferTo(targetFile);
        dept.setPath(newFileName);
        deptDao.add(dept);
    }

    @Override
    public List<Dept> list() throws IOException {

        return  deptDao.list();
    }

    @Override
    public void del(Integer id) throws IOException {
        deptDao.del(id);
    }
}
