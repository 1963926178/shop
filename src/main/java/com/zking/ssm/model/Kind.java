package com.zking.ssm.model;

public class Kind {
    private Integer kindId;

    private String kindName;

    private String kindPicture;

    private String kindPrice;

    private String kindSum;

    private String kindOutsum;

    private String kindState;

    private Integer goodsId;

    public Kind(Integer kindId, String kindName, String kindPicture, String kindPrice, String kindSum, String kindOutsum, String kindState, Integer goodsId) {
        this.kindId = kindId;
        this.kindName = kindName;
        this.kindPicture = kindPicture;
        this.kindPrice = kindPrice;
        this.kindSum = kindSum;
        this.kindOutsum = kindOutsum;
        this.kindState = kindState;
        this.goodsId = goodsId;
    }

    public Kind() {
        super();
    }

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public String getKindPicture() {
        return kindPicture;
    }

    public void setKindPicture(String kindPicture) {
        this.kindPicture = kindPicture;
    }

    public String getKindPrice() {
        return kindPrice;
    }

    public void setKindPrice(String kindPrice) {
        this.kindPrice = kindPrice;
    }

    public String getKindSum() {
        return kindSum;
    }

    public void setKindSum(String kindSum) {
        this.kindSum = kindSum;
    }

    public String getKindOutsum() {
        return kindOutsum;
    }

    public void setKindOutsum(String kindOutsum) {
        this.kindOutsum = kindOutsum;
    }

    public String getKindState() {
        return kindState;
    }

    public void setKindState(String kindState) {
        this.kindState = kindState;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}