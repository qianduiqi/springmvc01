package com.itheima.controller;

import com.itheima.domain.City;
import com.itheima.domain.Empl;
import com.itheima.service.CityService;
import com.itheima.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping("/list")
    public ModelAndView list() throws IOException {
        List<City> cityList=cityService.list();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject(cityList);
        modelAndView.setViewName("/pages/city-list.jsp");
        return modelAndView;

    }
    @RequestMapping("/del")
    public String del(Integer id) throws IOException {
        cityService.del(id);

        return "redirect:/city/list";

    }
    @RequestMapping("/delMany")
    @ResponseBody
    public String delMany(Integer[] ids) throws IOException {
        cityService.delMany(ids);

        return "ok";

    }

    @RequestMapping("/add")
    public String add(City city) throws IOException {
        cityService.add(city);

        return "redirect:/city/list";

    }

}
