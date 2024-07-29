package com.ust.Store.service;

import com.ust.Store.model.*;
import com.ust.Store.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StoreService {

    @Autowired
    private AppleRepo ar;
    @Autowired
    private MilkRepo mr;
    @Autowired
    private EggRepo er;
    @Autowired
    private ChocolateRepo cr;
    @Autowired
    private BreadRepo br;

    // Methods for adding individual items
    public Milk addMilk(Milk m) {
        return mr.save(m);
    }

    public Apple addApple(Apple a) {
        return ar.save(a);
    }

    public Eggs addEgg(Eggs e) {
        return er.save(e);
    }

    public Bread addBread(Bread b) {
        return br.save(b);
    }

    public Chocolate addChocolate(Chocolate c) {
        return cr.save(c);
    }

    // Methods for retrieving collections of items
    public Object getMilk() {
        return mr.findAll();
    }

    public Object getApple() {
        return ar.findAll();
    }

    public Object getChocolate() {
        return cr.findAll();
    }

    public Object getBread() {
        return br.findAll();
    }

    public Object getEgg() {
        return er.findAll();
    }

    // Method for retrieving all items and their quantities
    public Map<String, Object> getAll() {
        Map<String, Object> allItems = new HashMap<>();

        Iterable<Milk> milkList = mr.findAll();
        Iterable<Apple> appleList = ar.findAll();
        Iterable<Eggs> eggList = er.findAll();
        Iterable<Bread> breadList = br.findAll();
        Iterable<Chocolate> chocolateList = cr.findAll();

        int totalMilkQuantity = 0;
        for (Milk milk : milkList) {
            totalMilkQuantity += 1;
        }

        int totalAppleQuantity = 0;
        for (Apple apple : appleList) {
            totalAppleQuantity += 1;
        }

        int totalEggQuantity = 0;
        for (Eggs egg : eggList) {
            totalEggQuantity += 1;
        }

        int totalBreadQuantity = 0;
        for (Bread bread : breadList) {
            totalBreadQuantity += 1;
        }

        int totalChocolateQuantity = 0;
        for (Chocolate chocolate : chocolateList) {
            totalChocolateQuantity += 1;
        }

        int overallTotalQuantity = totalMilkQuantity + totalAppleQuantity + totalEggQuantity + totalBreadQuantity + totalChocolateQuantity;

        allItems.put("milk", milkList);
        allItems.put("totalMilkQuantity", totalMilkQuantity);
        allItems.put("apple", appleList);
        allItems.put("totalAppleQuantity", totalAppleQuantity);
        allItems.put("egg", eggList);
        allItems.put("totalEggQuantity", totalEggQuantity);
        allItems.put("bread", breadList);
        allItems.put("totalBreadQuantity", totalBreadQuantity);
        allItems.put("chocolate", chocolateList);
        allItems.put("totalChocolateQuantity", totalChocolateQuantity);
        allItems.put("overallTotalQuantity", overallTotalQuantity);

        return allItems;
    }

    // Methods for saving collections of items
    public Iterable<Milk> saveAllMilk(Iterable<Milk> milkList) {
        return mr.saveAll(milkList);
    }

    public Iterable<Eggs> saveAllEggs(Iterable<Eggs> eggList) {
        return er.saveAll(eggList);
    }

    public Iterable<Bread> saveAllBread(Iterable<Bread> breadList) {
        return br.saveAll(breadList);
    }

    public Iterable<Chocolate> saveAllChocolate(Iterable<Chocolate> chocolateList) {
        return cr.saveAll(chocolateList);
    }

    public Iterable<Apple> saveAllApple(Iterable<Apple> appleList) {
        return ar.saveAll(appleList);
    }

    // Methods for deleting individual items by ID
    public void deleteMilk(Long id) {
        mr.deleteById(id);
    }

    public void deleteEggs(Long id) {
        er.deleteById(id);
    }

    public void deleteBread(Long id) {
        br.deleteById(id);
    }

    public void deleteChocolate(Long id) {
        cr.deleteById(id);
    }

    public void deleteApple(Long id) {
        ar.deleteById(id);
    }

    // Methods for updating individual items by ID
    public Milk updateMilk(Long id, Milk milk) {
        Milk existingMilk = mr.findById(id).orElseThrow(() -> new RuntimeException("Milk not found with id: " + id));
        existingMilk.setMilkType(milk.getMilkType());
        existingMilk.setMilkQuantity(milk.getMilkQuantity());
        existingMilk.setMilkPrice(milk.getMilkPrice());
        return existingMilk;
    }

    public Apple updateApple(Long id, Apple apple) {
        Apple existingApple = ar.findById(id).orElseThrow(() -> new RuntimeException("Apple not found with id: " + id));
        existingApple.setColor(apple.getColor());
        existingApple.setOrigin(apple.getOrigin());
        existingApple.setPrice(apple.getPrice());
        return existingApple;
    }

    public Chocolate updateChocolate(Long id, Chocolate chocolate) {
        Chocolate existingChocolate = cr.findById(id).orElseThrow(() -> new RuntimeException("Chocolate not found with id: " + id));
        existingChocolate.setChocolateName(chocolate.getChocolateName());
        existingChocolate.setChocolatePrice(chocolate.getChocolatePrice());
        existingChocolate.setChocolateQuantity(chocolate.getChocolateQuantity());
        return existingChocolate;
    }

    public Bread updateBread(Long id, Bread bread) {
        Bread existingBread = br.findById(id).orElseThrow(() -> new RuntimeException("Bread not found with id: " + id));
        existingBread.setBreadType(bread.getBreadType());
        existingBread.setBreadPrice(bread.getBreadPrice());
        existingBread.setBreadQuantity(bread.getBreadQuantity());
        return existingBread;
    }

    public Eggs updateEggs(Long id, Eggs eggs) {
        Eggs existingEggs = er.findById(id).orElseThrow(() -> new RuntimeException("Eggs not found with id: " + id));
        existingEggs.setEggType(eggs.getEggType());
        existingEggs.setEggPrice(eggs.getEggPrice());
        existingEggs.setEggQuantity(eggs.getEggQuantity());
        return existingEggs;
    }

    // Methods for retrieving individual items by ID
    public Milk getMilkById(Long id) {
        return mr.findById(id).orElseThrow(() -> new RuntimeException("Milk not found with id: " + id));
    }

    public Apple getAppleById(Long id) {
        return ar.findById(id).orElseThrow(() -> new RuntimeException("Apple not found with id: " + id));
    }

    public Chocolate getChocolateById(Long id) {
        return cr.findById(id).orElseThrow(() -> new RuntimeException("Chocolate not found with id: " + id));
    }

    public Bread getBreadById(Long id) {
        return br.findById(id).orElseThrow(() -> new RuntimeException("Bread not found with id: " + id));
    }

    public Eggs getEggsById(Long id) {
        return er.findById(id).orElseThrow(() -> new RuntimeException("Eggs not found with id: " + id));
    }
}
