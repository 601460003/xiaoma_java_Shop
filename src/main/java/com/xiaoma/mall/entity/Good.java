package com.xiaoma.mall.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Good {
    //自增id
    private int id;
    //商品名称
    private String name;
    //商品描述
    private String remark;
    //商品价格
    private BigDecimal price;
    //商品图片
    private String image;
    //商品类型
    private int nameType;
    //创建时间
    private Date createTime;
    //状态
    private int status;
    //创建者
    private  int createUser;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRemark() {
        return remark;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public int getNameType() {
        return nameType;
    }

    public Date getCreatTime() {
        return createTime;
    }

    public int getStatus() {
        return status;
    }

    public int getCreateUser() {
        return createUser;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setNameType(int nameType) {
        this.nameType = nameType;
    }

    public void createTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCreateUser(int createUser) {
        this.createUser = createUser;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", nameType=" + nameType +
                ", createTime=" + createTime +
                ", status=" + status +
                ", createUser=" + createUser +
                '}';
    }
}
