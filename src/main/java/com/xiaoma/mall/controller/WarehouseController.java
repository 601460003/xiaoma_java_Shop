package com.xiaoma.mall.controller;

import com.alibaba.fastjson.JSONObject;
import com.xiaoma.mall.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 仓库接口
 */
@RestController
@RequestMapping("warehouse")
public class WarehouseController {
    @Autowired
    private WarehouseService warehouseService;

    /**
     * 更新商品库存 @requestBody 注释表示接收一个json数据
     *
     * @param requrestJson
     * goodId 商品id
     * type 0：存在增加 1：库存减少
     * oldAmount 旧库存
     *
     */
    @PostMapping("updateWarehouse")
    public JSONObject updateWarehouse(@RequestBody JSONObject requrestJson){
        return warehouseService.updateWarehouse(requrestJson);
    }
}
