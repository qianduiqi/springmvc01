package com.itheima.controller;

import com.itheima.domain.City;
import com.itheima.domain.Group;
import com.itheima.service.CityService;
import com.itheima.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/group")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @RequestMapping("/list")
    public ModelAndView list() throws IOException {
        List<Group> groupList=groupService.list();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject(groupList);
        modelAndView.setViewName("/pages/group-list.jsp");
        return modelAndView;

    }
    @RequestMapping("/del")
    public String del(Integer id) throws IOException {
        groupService.del(id);

        return "redirect:/group/list";

    }
    @RequestMapping("/add")
    public String add(Group group,String deptName) throws IOException {
        groupService.add(group,deptName);

        return "redirect:/group/list";

    }

}
