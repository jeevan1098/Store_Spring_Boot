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
public class Eggs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eggId;
    private String eggType;
    private double eggPrice;
    private int eggQuantity;

    public Long getEggId() {
        return eggId;
    }

    public void setEggId(Long eggId) {
        this.eggId = eggId;
    }

    public String getEggType() {
        return eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    public double getEggPrice() {
        return eggPrice;
    }

    public void setEggPrice(double eggPrice) {
        this.eggPrice = eggPrice;
    }

    public int getEggQuantity() {
        return eggQuantity;
    }

    public void setEggQuantity(int eggQuantity) {
        this.eggQuantity = eggQuantity;
    }
}
