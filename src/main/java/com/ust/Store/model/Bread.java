package com.ust.Store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bread {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long breadId;
    private String breadType;
    private double breadPrice;
    private int breadQuantity;

    public Long getBreadId() {
        return breadId;
    }

    public void setBreadId(Long breadId) {
        this.breadId = breadId;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public double getBreadPrice() {
        return breadPrice;
    }

    public void setBreadPrice(double breadPrice) {
        this.breadPrice = breadPrice;
    }

    public int getBreadQuantity() {
        return breadQuantity;
    }

    public void setBreadQuantity(int breadQuantity) {
        this.breadQuantity = breadQuantity;
    }
}
