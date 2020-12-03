package com.xiaoma.mall.dao;

import com.alibaba.fastjson.JSONObject;
import com.xiaoma.mall.entity.ShoppingCar;

import java.util.List;

public interface ShoppingCarDao {
    List<JSONObject> getList(int memberId);

    void cleanCarIds(List<Integer> carIds);

    ShoppingCar getCar(ShoppingCar shoppingCar);

    void add(ShoppingCar shoppingCar);

    void update(ShoppingCar existCar);
}
