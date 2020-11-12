package com.zking.ssm.model;

public class Cart {
    private Integer cartId;

    private Float cartSum;

    private Integer cartCount;

    private Integer goodsId;

    private Integer kindId;

    private Integer userId;

    public Cart(Integer cartId, Float cartSum, Integer cartCount, Integer goodsId, Integer kindId, Integer userId) {
        this.cartId = cartId;
        this.cartSum = cartSum;
        this.cartCount = cartCount;
        this.goodsId = goodsId;
        this.kindId = kindId;
        this.userId = userId;
    }

    public Cart() {
        super();
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Float getCartSum() {
        return cartSum;
    }

    public void setCartSum(Float cartSum) {
        this.cartSum = cartSum;
    }

    public Integer getCartCount() {
        return cartCount;
    }

    public void setCartCount(Integer cartCount) {
        this.cartCount = cartCount;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}