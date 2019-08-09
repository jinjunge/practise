package com.sand.springmvc.service.impl;

import com.sand.springmvc.mapper.ItemMapper;
import com.sand.springmvc.pojo.Item;
import com.sand.springmvc.pojo.ItemExample;
import com.sand.springmvc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: gejinjun
 * @Description:
 * @Date: 16:09 2019/8/6
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemMapper itemMapper;
    @Override
    public List<Item> getItemList() {
//        ItemExample itemExample=new ItemExample();
//        List<Integer> idList = Arrays.asList(1,2,3);
//        itemExample.createCriteria().andIdIn(idList);
        List<Item> itemList=itemMapper.selectByExample(null);
        return itemList;
    }
}
