package com.xiaoma.mall.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Wallet {
    private int memberId;
    private Double money;
    private int status;
    private Date createTime;
    private int createUser;

    public int getMemberId() {
        return memberId;
    }

    public Double getMoney() {
        return money;
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

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setMoney(Double money) {
        this.money = money;
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

    public void setMoney(BigDecimal bigDecimal) {
    }
}
