package com.itheima.service;

import com.itheima.domain.City;
import com.itheima.domain.Dept;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface DeptService {




    void add(MultipartFile file, Dept dept) throws IOException;

    List<Dept> list() throws IOException;

    void del(Integer id) throws IOException;
}
