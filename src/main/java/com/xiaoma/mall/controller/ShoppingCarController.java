package com.xiaoma.mall.controller;

import com.alibaba.fastjson.JSONObject;
import com.xiaoma.mall.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shoppingCar")
public class ShoppingCarController {
    @Autowired
    private ShoppingCarService shoppingCarService;

    @PostMapping("add")
    public String add(@RequestBody JSONObject resqurestJson){
        return shoppingCarService.addShoppingCar(resqurestJson);
    }
}
