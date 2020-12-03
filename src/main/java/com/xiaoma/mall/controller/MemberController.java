package com.xiaoma.mall.controller;

import com.alibaba.fastjson.JSONObject;
import com.xiaoma.mall.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("login")
    public JSONObject addMember(@RequestBody JSONObject requrstJson){
        return memberService.addMember(requrstJson);
    }

}
