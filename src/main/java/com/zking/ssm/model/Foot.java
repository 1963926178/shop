package com.zking.ssm.model;

import java.util.Date;

public class Foot {
    private Integer footId;

    private Date footDate;

    private Integer userId;

    private Integer goodsId;

    public Foot(Integer footId, Date footDate, Integer userId, Integer goodsId) {
        this.footId = footId;
        this.footDate = footDate;
        this.userId = userId;
        this.goodsId = goodsId;
    }

    public Foot() {
        super();
    }

    public Integer getFootId() {
        return footId;
    }

    public void setFootId(Integer footId) {
        this.footId = footId;
    }

    public Date getFootDate() {
        return footDate;
    }

    public void setFootDate(Date footDate) {
        this.footDate = footDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}