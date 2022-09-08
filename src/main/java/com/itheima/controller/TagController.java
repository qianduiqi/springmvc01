package com.itheima.controller;

import com.itheima.domain.Tag;
import com.itheima.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;


@Controller
@RequestMapping("/tag")
public class TagController {
    @Autowired
    private TagService tagService;

    @RequestMapping("/list")
    public ModelAndView modelAndView() throws IOException {
        ModelAndView modelAndView=new ModelAndView();
        List<Tag> tagList=tagService.list();
        modelAndView.addObject(tagList);
        modelAndView.setViewName("/pages/tag-list.jsp");
        return modelAndView;
    }
    @RequestMapping("/del")
    public String del(Integer id) throws IOException {
        tagService.del(id);
        return "redirect:/tag/list";
    }
    @RequestMapping("/add")
    public String add(Tag tag) throws IOException {
        tagService.add(tag);
        return "redirect:/tag/list";
    }

}
