package com.xiaoma.mall.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xiaoma.mall.dao.MemberDao;
import com.xiaoma.mall.dao.ShoppingCarDao;
import com.xiaoma.mall.dao.WalletDao;
import com.xiaoma.mall.entity.Member;
import com.xiaoma.mall.entity.Wallet;
import com.xiaoma.mall.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private ShoppingCarDao shoppingCarDao;
    @Autowired
    private MemberDao memberDao;
    @Autowired
    private WalletDao walletDao;

    @Transactional
    @Override
    public JSONObject addMember(JSONObject requestJson){

        //将json中字段转为member实体
        Member member = JSONObject.toJavaObject(requestJson,Member.class);

        //查询会员
        JSONObject existMember = memberDao.getMemberByMobile(member);
        System.out.println(existMember);
        if(existMember==null){
            //创建会员
            member.setCreateTime(new Date());
            member.setAddress("");
            member.setCreateUser(1);
            member.setSex(0);
            memberDao.addMember(member);
            //创建钱包
            Wallet wallet =new Wallet();
            wallet.setMemberId(member.getId());
            wallet.setCreateTime(new Date());
            wallet.setStatus(0);
            wallet.setCreateUser(1);
            wallet.setMoney(new BigDecimal(0));
            walletDao.addWallet(wallet);
            System.out.println(wallet.toString()+"======wallet");

            //这里好像小了一部操作
            JSONObject memberDto = new JSONObject();
            memberDto.put("id",member.getId());
            memberDto.put("name",member.getName());
            memberDto.put("mobile",member.getMobile());
            memberDto.put("money",0);
            return memberDto;
        }
        return existMember;
    }
//    点击提交过去最新的用户列表。 更新用户信息的接口为member/modifyMember,里面稍微有点逻辑判断
    @Transactional
    @Override
    public String modifyMember(JSONObject requestJson){
        Member member = JSON.toJavaObject(requestJson,Member.class);
        //先查找用户是否存在
        if(memberDao.getMemberByMobile(member)!=null){
            //跟新用户的手机地址
            memberDao.update(requestJson);
            //跟新用户钱包
            walletDao.update(requestJson);
            return "ok";
        }else {
            return "error";
        }
    }

//    点击提交过去最新的用户列表。 更新用户信息的接口为member/modifyMember,里面稍微有点逻辑判断
    /**
     * 1.查询购物的商品，进行计费；
     * 2.查询用户钱包余额
     * 3.判断用户钱包金额是否足够清空购物车，否则提示错误。
     * 4.清空购物车时，先对用户钱包进行扣费，再对库存进行相减，最后将购物车中的商品状态设置为1。
     */
    @Override
    public String cleanCar(JSONObject requestJson){
        int memberId = requestJson.getByteValue("memberId");
        List<Integer> carIds = new ArrayList<>();
        //获取购物车商品
        List<JSONObject> list = shoppingCarDao.getList(memberId);
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (JSONObject item:list){
            totalPrice = totalPrice.add(item.getBigDecimal("price"));
            carIds.add(item.getIntValue("id"));
        }

        Wallet wallet = walletDao.getWalletByMemberId(memberId);
//        钱包余额足够清空购物车
        if(wallet.getMoney().compareTo(totalPrice)>=0){
           BigDecimal residue = wallet.getMoney().subtract(totalPrice);
           JSONObject updateParams = new JSONObject();
           updateParams.put("money",residue);
           updateParams.put("id",wallet.getMemberId());
           walletDao.update(updateParams);
           //删除购物车中的商品
            shoppingCarDao.cleanCarIds(carIds);
            //减库存
            for (JSONObject item:list){
                walletDao.subtractWrehouse(item);
            }
        }else {
            return "error";
        }
        return "ok";
    }
}
