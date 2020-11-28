package com.xiaoma.mall.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Warehouse {
    private int goodId;
    //状态
    private int status;
    //创建时间
    private Date createTime;
    //创建者
    private  int createUser;
    //数量
    private  int amount;

    public int getGoodId() {
        return goodId;
    }

    public int getStatus() {
        return status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getCreateUser() {
        return createUser;
    }

    public int getAmount() {
        return amount;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setCreateUser(int createUser) {
        this.createUser = createUser;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
