package com.zking.ssm.model;

public class Goods {
    private Integer goodsId;

    private String goodsName;

    private String goodsInfo;

    private Integer typeId;

    public Goods(Integer goodsId, String goodsName, String goodsInfo, Integer typeId) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsInfo = goodsInfo;
        this.typeId = typeId;
    }

    public Goods() {
        super();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}