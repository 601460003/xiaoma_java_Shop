package com.xiaoma.mall.entity;

import java.util.Date;

public class ShoppingCar {
    private int id;
    private int goodId;
    private int amount;
    private int memberId;
    private int status;
    private Date createTime;
    private int createUser;

    public int getId() {
        return id;
    }


    public int getAmount() {
        return amount;
    }

    public int getMemberId() {
        return memberId;
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

    public void setId(int id) {
        this.id = id;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
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
}
