package com.ohgiraffers.mapping.section01.entity;

import javax.persistence.*;

@Entity
@Table(name = "TBL_SNACK")
public class Snack {

    @Id
    @Column(name = "SNACK_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int snackNo;

    @Column(name = "SNACK_NAME")
    private String snackName;

    @Column(name = "SNACK_COMPANY")
    private String snackCompany;

    @Column(name = "ORDERABLE_STATUS", columnDefinition = "char(1) default 'Y'")
    @Enumerated(EnumType.STRING)
    private OrderableStauts orderableStatus;

    @Column(name = "CALORIES")
    private int calories;

    @Embedded
    private Price price;

    public Snack(String snackName, String snackCompany, OrderableStauts orderableStatus, String company, Price price) {
    }

    protected Snack() {
    }

    public Snack(String snackName, String snackCompany, OrderableStauts orderableStatus, int calories, Price price) {
        this.snackName = snackName;
        this.snackCompany = snackCompany;
        this.orderableStatus = orderableStatus;
        this.calories = calories;
        this.price = price;
    }

    public int getSnackNo() {
        return snackNo;
    }

    public String getSnackName() {
        return snackName;
    }

    public String getSnackCompany() {
        return snackCompany;
    }

    public OrderableStauts getOrderableStatus() {
        return orderableStatus;
    }

    public int getCalories() {
        return calories;
    }

    public Price getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snackNo=" + snackNo +
                ", snackName='" + snackName + '\'' +
                ", snackCompany='" + snackCompany + '\'' +
                ", orderableStatus=" + orderableStatus +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
