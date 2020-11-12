package com.zking.ssm.model;

public class OrderItem {
    private Integer orderitemId;

    private Integer goodsId;

    private Integer kindId;

    private Integer count;

    private Long orderitemSum;

    private Integer orderitemState;

    private Integer orderId;

    public OrderItem(Integer orderitemId, Integer goodsId, Integer kindId, Integer count, Long orderitemSum, Integer orderitemState, Integer orderId) {
        this.orderitemId = orderitemId;
        this.goodsId = goodsId;
        this.kindId = kindId;
        this.count = count;
        this.orderitemSum = orderitemSum;
        this.orderitemState = orderitemState;
        this.orderId = orderId;
    }

    public OrderItem() {
        super();
    }

    public Integer getOrderitemId() {
        return orderitemId;
    }

    public void setOrderitemId(Integer orderitemId) {
        this.orderitemId = orderitemId;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getOrderitemSum() {
        return orderitemSum;
    }

    public void setOrderitemSum(Long orderitemSum) {
        this.orderitemSum = orderitemSum;
    }

    public Integer getOrderitemState() {
        return orderitemState;
    }

    public void setOrderitemState(Integer orderitemState) {
        this.orderitemState = orderitemState;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}