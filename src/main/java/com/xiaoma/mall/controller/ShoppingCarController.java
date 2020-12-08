package com.xiaoma.mall.controller;

import com.alibaba.fastjson.JSONObject;
import com.xiaoma.mall.dao.ShoppingCarDao;
import com.xiaoma.mall.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shoppingCar")
public abstract class ShoppingCarController {
    @Autowired
    private ShoppingCarService shoppingCarService;

    @Autowired
    private ShoppingCarDao shoppingCarDao;

    @PostMapping("add")
    public String add(@RequestBody JSONObject resqurestJson){
        return shoppingCarService.addShoppingCar(resqurestJson);
    }
    @GetMapping("getList")
     List<JSONObject> getList(int response){
        System.out.println(response+"========responsegetList/{memberId}\"");
        return shoppingCarDao.getList(response);
    }

}
