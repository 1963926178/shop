package com.zking.ssm.model;

public class Order {
    private Integer orderId;

    private Float orderSum;

    private Integer orderState;

    private Integer userId;

    public Order(Integer orderId, Float orderSum, Integer orderState, Integer userId) {
        this.orderId = orderId;
        this.orderSum = orderSum;
        this.orderState = orderState;
        this.userId = userId;
    }

    public Order() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Float getOrderSum() {
        return orderSum;
    }

    public void setOrderSum(Float orderSum) {
        this.orderSum = orderSum;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}