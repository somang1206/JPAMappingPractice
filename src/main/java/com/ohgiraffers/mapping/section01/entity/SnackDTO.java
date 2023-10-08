package com.ohgiraffers.mapping.section01.entity;

public class SnackDTO {

    private String snackName;

    private String snackCompany;

    private OrderableStauts orderableStatus;

    private int calories;

    private int regularPrice;

    private double discountRate;


    public SnackDTO() {
    }

    public SnackDTO(String snackName, String snackCompany, OrderableStauts orderableStatus, int calories, int regularPrice, double discountRate) {
        this.snackName = snackName;
        this.snackCompany = snackCompany;
        this.orderableStatus = orderableStatus;
        this.calories = calories;
        this.regularPrice = regularPrice;
        this.discountRate = discountRate;
    }


    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public String getSnackCompany() {
        return snackCompany;
    }

    public void setSnackCompany(String snackCompany) {
        this.snackCompany = snackCompany;
    }

    public OrderableStauts getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(OrderableStauts orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(int regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }


    @Override
    public String toString() {
        return "SnackDTO{" +
                "snackName='" + snackName + '\'' +
                ", snackCompany='" + snackCompany + '\'' +
                ", orderableStatus=" + orderableStatus +
                ", calories=" + calories +
                ", regularPrice=" + regularPrice +
                ", discountRate=" + discountRate +
                '}';
    }
}
