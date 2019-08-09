package com.sand.springmvc.controller;

import com.sand.springmvc.mapper.ItemMapper;
import com.sand.springmvc.pojo.Item;
import com.sand.springmvc.pojo.ItemExample;
import com.sand.springmvc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
@Controller
public class ItemController {
    @Autowired
    ItemService itemService;
    @RequestMapping("itemList")
    public ModelAndView itemList(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/itemList.jsp");
        List<Item> itemList=itemService.getItemList();
        modelAndView.addObject("itemList",itemList);
        return modelAndView;
    }
}
