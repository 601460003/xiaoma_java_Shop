package com.xiaoma.mall.dao;

import com.alibaba.fastjson.JSONObject;
import com.xiaoma.mall.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface MemberDao {
    

    void update(JSONObject resquesJson);

    void addMember(Member member);

    JSONObject getMemberByMobile(Member member);
}
