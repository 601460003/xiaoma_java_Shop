package com.xiaoma.mall.dao;


import com.xiaoma.mall.entity.Good;

import org.apache.ibatis.annotations.Mapper;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface GoodDao {
    void add(Good good);
    List<JSONObject> getList();
}
