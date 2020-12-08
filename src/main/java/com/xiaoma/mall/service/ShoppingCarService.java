package com.xiaoma.mall.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ShoppingCarService {
    String addShoppingCar(JSONObject requestJson);

    List<JSONObject> getList(JSONObject response);
}
