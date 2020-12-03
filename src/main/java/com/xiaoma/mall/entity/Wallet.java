package com.xiaoma.mall.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Wallet {
    private int member_id;
    private String money;
    private int status;
    private Date create_time;
    private int create_user;

    public int getMember_id() {
        return member_id;
    }

    public String getMoney() {
        return money;
    }

    public int getStatus() {
        return status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public int getCreate_user() {
        return create_user;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public void setCreate_user(int create_user) {
        this.create_user = create_user;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "member_id=" + member_id +
                ", money=" + money +
                ", status=" + status +
                ", create_time=" + create_time +
                ", create_user=" + create_user +
                '}';
    }
}
