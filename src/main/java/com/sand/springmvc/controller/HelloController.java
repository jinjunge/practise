package com.sand.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("hello")
    public ModelAndView Hello(){
        System.out.println("hello");
        ModelAndView mav=new ModelAndView();
        mav.addObject("msg","hello springmvc");
        mav.setViewName("/index.jsp");
        return mav;
    }

}
