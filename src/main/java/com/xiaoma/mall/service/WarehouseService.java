package com.xiaoma.mall.service;

import com.alibaba.fastjson.JSONObject;
import com.xiaoma.mall.entity.Warehouse;

import java.util.List;

public interface WarehouseService {
    void addWarehouse(Warehouse warehouse);
    String updateWarehouse(JSONObject warehouse);

    List<Warehouse> getWarehouseByGoodId(JSONObject warehouse);
}
