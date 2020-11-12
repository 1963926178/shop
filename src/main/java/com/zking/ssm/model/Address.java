package com.zking.ssm.model;

public class Address {
    private Integer addressId;

    private String addressCity;

    private String addressName;

    private String addressPhone;

    private String addressRole;

    private Integer userId;

    public Address(Integer addressId, String addressCity, String addressName, String addressPhone, String addressRole, Integer userId) {
        this.addressId = addressId;
        this.addressCity = addressCity;
        this.addressName = addressName;
        this.addressPhone = addressPhone;
        this.addressRole = addressRole;
        this.userId = userId;
    }

    public Address() {
        super();
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressPhone() {
        return addressPhone;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone;
    }

    public String getAddressRole() {
        return addressRole;
    }

    public void setAddressRole(String addressRole) {
        this.addressRole = addressRole;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}