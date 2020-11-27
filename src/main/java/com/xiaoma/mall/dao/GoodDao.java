package com.xiaoma.mall.dao;


import com.xiaoma.mall.entity.Good;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface GoodDao {
    void add(Good good);
}
