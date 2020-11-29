package com.xiaoma.mall.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.xiaoma.mall.dao.WarehouseDao;
import com.xiaoma.mall.entity.Warehouse;
import com.xiaoma.mall.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    private WarehouseDao warehouseDao;

    @Override
    public void addWarehouse(Warehouse warehouse) {

    }

    @Transactional
    @Override
    public String updateWarehouse(JSONObject requestJson){
        //从json数据获取字段值
        int goodId = requestJson.getByteValue("goodId");
        int type = requestJson.getIntValue("type");
        int oldAmount = requestJson.getIntValue("oldAmount");
        //先判断有无数据库存数据
        Warehouse warehouse = warehouseDao.getWarehouseByGoodId(goodId);
        if(warehouse==null){
            //无库存数据插入一条
            warehouse = new Warehouse();
            warehouse.setGoodId(goodId);
            warehouse.setStatus(0);
            warehouse.setAmount(0);
            warehouse.setCreateTime(new Date());
            warehouse.setCreateUser(1);
            warehouseDao.addWarehouse(warehouse);
        }
        int amount;
        if(type==0){//库存增加
            amount = oldAmount+1;
        }else {
            amount =oldAmount-1;
        }
        warehouseDao.updateWarehouse(goodId,amount,oldAmount);
        return "ok";
    }

    @Override
    public List<Warehouse> getWarehouseByGoodId(JSONObject warehouse) {
        return null;
    }

}
