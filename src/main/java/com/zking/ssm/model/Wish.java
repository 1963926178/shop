package com.zking.ssm.model;

import java.util.Date;

public class Wish {
    private Integer wishId;

    private Date wishTime;

    private Integer goodsId;

    private Integer userId;

    public Wish(Integer wishId, Date wishTime, Integer goodsId, Integer userId) {
        this.wishId = wishId;
        this.wishTime = wishTime;
        this.goodsId = goodsId;
        this.userId = userId;
    }

    public Wish() {
        super();
    }

    public Integer getWishId() {
        return wishId;
    }

    public void setWishId(Integer wishId) {
        this.wishId = wishId;
    }

    public Date getWishTime() {
        return wishTime;
    }

    public void setWishTime(Date wishTime) {
        this.wishTime = wishTime;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}