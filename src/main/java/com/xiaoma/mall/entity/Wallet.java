package com.xiaoma.mall.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Wallet {
    private int id;
    private int memberId;
    private BigDecimal money;
    private int status;
    private Date createTime;
    private int createUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemberId() {
        return memberId;
    }

    public BigDecimal getMoney() {
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

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setCreateUser(int createUser) {
        this.createUser = createUser;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "id=" + id +
                ", memberId=" + memberId +
                ", money=" + money +
                ", status=" + status +
                ", createTime=" + createTime +
                ", createUser=" + createUser +
                '}';
    }
}
