package com.xiaoma.mall.entity;

import java.util.Date;

public class Member {
    private int id;
    private String name;
    private String sex;
    private String address;
    private String mobile;
    private Date createTime;
    private int status;
    private int create_user;

    public String getName() {
        return name;
    }

    public String getSex() {
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

    public int getCreate_user() {
        return create_user;
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

    public void setCreate_user(int create_user) {
        this.create_user = create_user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", createTime=" + createTime +
                ", status=" + status +
                ", create_user=" + create_user +
                '}';
    }
}
