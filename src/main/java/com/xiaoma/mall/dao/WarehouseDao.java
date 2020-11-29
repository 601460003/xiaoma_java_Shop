package com.xiaoma.mall.dao;

import com.xiaoma.mall.entity.Warehouse;
import org.apache.ibatis.annotations.Mapper;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface WarehouseDao {
    void addWarehouse(Warehouse warehouse);

    void updateWarehouse(JSONObject warehouse);


    Warehouse getWarehouseByGoodId(int goodId);

    void updateWarehouse(int goodId, int amount, int oldAmount);
}
