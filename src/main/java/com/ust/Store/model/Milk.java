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
public class Milk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long milkId;
    private String milkType;
    private double milkPrice;
    private int milkQuantity;

    public Long getMilkId() {
        return milkId;
    }

    public void setMilkId(Long milkId) {
        this.milkId = milkId;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getMilkPrice() {
        return milkPrice;
    }

    public void setMilkPrice(double milkPrice) {
        this.milkPrice = milkPrice;
    }

    public int getMilkQuantity() {
        return milkQuantity;
    }

    public void setMilkQuantity(int milkQuantity) {
        this.milkQuantity = milkQuantity;
    }
}
