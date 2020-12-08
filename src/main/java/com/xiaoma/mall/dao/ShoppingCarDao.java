package com.xiaoma.mall.dao;

import com.alibaba.fastjson.JSONObject;
import com.xiaoma.mall.entity.ShoppingCar;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ShoppingCarDao {
    List<JSONObject> getList(int memberId);

    void cleanCarIds(List<Integer> carIds);

    ShoppingCar getCar(ShoppingCar shoppingCar);

    void add(ShoppingCar shoppingCar);

    void update(ShoppingCar existCar);

    List<JSONObject> getList(JSONObject requestJson);
}
