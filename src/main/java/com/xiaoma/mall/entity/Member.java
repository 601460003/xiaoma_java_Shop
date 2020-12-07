package com.xiaoma.mall.entity;

import java.util.Date;

public class Member {
    private int id;
    private String name;
    private int sex;
    private String address;
    private String mobile;
    private Date createTime;
    private int status;
    private int createUser;

    public String getName() {
        return name;
    }

    public int getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getStatus() {
        return status;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreateUser() {
        return createUser;
    }

    public void setCreateUser(int createUser) {
        this.createUser = createUser;
    }
}
