package com.xiaoma.mall.service;

import com.xiaoma.mall.entity.Good;
import org.json.JSONObject;

import java.util.List;

public interface GoodService {
    void add(Good good);

    List<JSONObject> getList();
}
