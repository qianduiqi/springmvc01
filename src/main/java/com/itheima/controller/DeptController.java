package com.itheima.controller;


import com.itheima.domain.City;
import com.itheima.domain.Dept;
import com.itheima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;


    @RequestMapping("/add")
    public String add(MultipartFile file, Dept dept) throws IOException {
        deptService.add(file,dept);
        return "redirect:/dept/list";
   }
    @RequestMapping("/list")
    public ModelAndView list() throws IOException {
        List<Dept> deptList=deptService.list();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject(deptList);
        modelAndView.setViewName("/pages/dept-list.jsp");
        return modelAndView;

    }
    @RequestMapping("/del")
    public String del(Integer id) throws IOException {
        deptService.del(id);

        return "redirect:/dept/list";

    }
}
