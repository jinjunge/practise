package com.sand.springmvc.service;

import com.sand.springmvc.pojo.Item;

import java.util.List;

/**
 * 商品信息业务逻辑接口
 * @Author: gejinjun
 * @Description:
 * @Date: 16:08 2019/8/6
 */
public interface ItemService {
    public List<Item> getItemList();
}
