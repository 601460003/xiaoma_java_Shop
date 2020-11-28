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

    List<JSONObject> getWarehouseByGoodId(Warehouse warehouse);

}
