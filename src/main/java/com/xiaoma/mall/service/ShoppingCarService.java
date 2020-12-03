package com.xiaoma.mall.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.transaction.annotation.Transactional;

public interface ShoppingCarService {
    @Transactional
    String addShoppingCar(JSONObject requestJson);
}
