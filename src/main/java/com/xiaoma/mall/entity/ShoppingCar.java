package com.xiaoma.mall.entity;

import java.util.Date;

public class ShoppingCar {
    private int id;
    private int good_id;
    private int amout;
    private int member_id;
    private int status;
    private Date create_time;
    private int create_user;

    public int getId() {
        return id;
    }

    public int getGood_id() {
        return good_id;
    }

    public int getAmout() {
        return amout;
    }

    public int getMember_id() {
        return member_id;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public void setAmout(int amout) {
        this.amout = amout;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
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
}
