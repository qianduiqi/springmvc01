package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserContrller {

    @Autowired
    private UserService userService;
    @RequestMapping("/login")

    public String login(String name, String pwd, HttpSession session) throws IOException {
        User user=new User();
        user.setName(name);
        user.setPwd(pwd);
        User u=userService.query(user);
        if(u!=null){
            session.setAttribute("user",user);
            return "redirect:/index.jsp";
        }

        return "redirect:/login.jsp";

   }
    @RequestMapping("/add")

    public String add(User user) throws IOException {
        userService.add(user);


        return "redirect:/login.jsp";

    }
    @RequestMapping("/change")

    public String change(User user) throws IOException {
        userService.change(user);


        return "redirect:/login.jsp";

    }


}
