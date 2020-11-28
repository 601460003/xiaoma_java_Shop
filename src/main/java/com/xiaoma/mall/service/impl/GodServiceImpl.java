package com.xiaoma.mall.service.impl;

import com.xiaoma.mall.dao.GoodDao;
import com.xiaoma.mall.entity.Good;
import com.xiaoma.mall.service.GoodService;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GodServiceImpl implements GoodService {
    @Autowired
    private GoodDao goodDao;

    @Override
    @Transactional
    public void add(Good good){
        goodDao.add(good);
    }

    @Override
    public  List<JSONObject> getList(){
        return goodDao.getList();
    }
}
