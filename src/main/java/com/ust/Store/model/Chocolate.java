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
public class Chocolate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long chocolateId;
    private String chocolateName;
    private double chocolatePrice;
    private int chocolateQuantity;

    public Long getChocolateId() {
        return chocolateId;
    }

    public void setChocolateId(Long chocolateId) {
        this.chocolateId = chocolateId;
    }

    public String getChocolateName() {
        return chocolateName;
    }

    public void setChocolateName(String chocolateName) {
        this.chocolateName = chocolateName;
    }

    public double getChocolatePrice() {
        return chocolatePrice;
    }

    public void setChocolatePrice(double chocolatePrice) {
        this.chocolatePrice = chocolatePrice;
    }

    public int getChocolateQuantity() {
        return chocolateQuantity;
    }

    public void setChocolateQuantity(int chocolateQuantity) {
        this.chocolateQuantity = chocolateQuantity;
    }
}
