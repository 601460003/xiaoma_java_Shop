package com.xiaoma.mall.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.transaction.annotation.Transactional;

public interface MemberService {
    //    点击提交过去最新的用户列表。 更新用户信息的接口为member/modifyMember,里面稍微有点逻辑判断
        @Transactional
        String modifyMember(JSONObject resquesJson);

    String cleanCar(JSONObject requestJson);

    JSONObject addMember(JSONObject requrstJson);
}
