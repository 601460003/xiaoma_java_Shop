package com.xiaoma.mall.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.xiaoma.mall.dao.ShoppingCarDao;
import com.xiaoma.mall.dao.WarehouseDao;
import com.xiaoma.mall.entity.ShoppingCar;
import com.xiaoma.mall.entity.Warehouse;
import com.xiaoma.mall.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class ShoppingCarServiceImpl implements ShoppingCarService {

    @Autowired
    private WarehouseDao warehouseDao;

    @Autowired
    private ShoppingCarDao shoppingCarDao;

    @Transactional
    @Override
    public String addShoppingCar(JSONObject requestJson){
        int goodId = requestJson.getIntValue("goodId");
        int memberId = requestJson.getIntValue("menberId");
        //先判断数量大于0才能添加
        Warehouse warehouse = warehouseDao.getWarehouseByGoodId(goodId);
        if(warehouse!=null){
            //》0才能添加
            ShoppingCar shoppingCar =new ShoppingCar();
            shoppingCar.setMember_id(memberId);
            shoppingCar.setGood_id(goodId);
            ShoppingCar existCar = shoppingCarDao.getCar(shoppingCar);
            //购物车插入一条数据
            if(existCar==null){
                shoppingCar.setAmout(1);
                shoppingCar.setCreate_time(new Date());
                shoppingCar.setCreate_user(1);
                shoppingCar.setStatus(0);
                shoppingCarDao.add(shoppingCar);
            }else {
                //跟新购物车信息
                shoppingCarDao.update(existCar);
            }
          return "ok";
        }
        return "error";
    }
}
