package com.itheima.controller;

import com.itheima.domain.Empl;
import com.itheima.domain.Tag;
import com.itheima.service.EmplService;
import com.itheima.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


@Controller
@RequestMapping("/empl")
public class EmplController {
    @Autowired
    private EmplService emplService;

    @RequestMapping(value = "/list")
    public ModelAndView list(@RequestParam(defaultValue = "1") int currentPage, String name,
                             HttpSession session) throws IOException {


        if(name!=null){
            session.setAttribute("searchName", name);
        }



        PageInfo<Empl> pageInfo = emplService.list(currentPage, name);

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("pageInfo", pageInfo);
        modelAndView.setViewName("/pages/employee-list.jsp");
        return modelAndView;

    }

    @RequestMapping("/change")
    public String change(Empl empl) throws IOException {
        emplService.change(empl);

        return "redirect:/empl/list?name=";

    }

    @RequestMapping("/del")
    public String del(Integer eid) throws IOException {
        emplService.del(eid);

        return "redirect:/empl/list?name=";

    }

    @RequestMapping("/add")
    public String add(Empl empl,Integer[] tagIds) throws IOException {
        emplService.add(empl,tagIds);

        return "redirect:/empl/list?name=";

    }
    @RequestMapping("/saveUI")
    public ModelAndView saveUI() throws IOException {
        ModelAndView modelAndView=new ModelAndView();
        List<Tag> tagList= emplService.queryTag();
        modelAndView.addObject(tagList);
        modelAndView.setViewName("/pages/employee-add.jsp");
        return modelAndView;

    }
}
