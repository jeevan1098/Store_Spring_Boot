package com.ust.Store.controller;

import com.ust.Store.model.*;
import com.ust.Store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreService storeService;

    // POST Mappings for adding individual items
    @PostMapping("/milkadd")
    public Milk addMilk(@RequestBody Milk milk) {
        return storeService.addMilk(milk);
    }

    @PostMapping("/appleadd")
    public Apple addApple(@RequestBody Apple apple) {
        return storeService.addApple(apple);
    }

    @PostMapping("/chocolateadd")
    public Chocolate addChocolate(@RequestBody Chocolate chocolate) {
        return storeService.addChocolate(chocolate);
    }

    @PostMapping("/breadadd")
    public Bread addBread(@RequestBody Bread bread) {
        return storeService.addBread(bread);
    }

    @PostMapping("/eggadd")
    public Eggs addEgg(@RequestBody Eggs egg) {
        return storeService.addEgg(egg);
    }

    // GET Mappings for retrieving individual collections
    @GetMapping("/milks")
    public Iterable<Milk> getMilk() {
        return (Iterable<Milk>) storeService.getMilk();
    }

    @GetMapping("/apples")
    public Iterable<Apple> getApple() {
        return (Iterable<Apple>) storeService.getApple();
    }

    @GetMapping("/chocolates")
    public Iterable<Chocolate> getChocolate() {
        return (Iterable<Chocolate>) storeService.getChocolate();
    }

    @GetMapping("/breads")
    public Iterable<Bread> getBread() {
        return (Iterable<Bread>) storeService.getBread();
    }

    @GetMapping("/eggs")
    public Iterable<Eggs> getEgg() {
        return (Iterable<Eggs>) storeService.getEgg();
    }

    // GET Mapping for retrieving all items
    @GetMapping("/all")
    public Map<String, Object> getAll() {
        return storeService.getAll();
    }

    // POST Mappings for saving collections of items
    @PostMapping("/milk/saveall")
    public Iterable<Milk> saveAllMilk(@RequestBody Iterable<Milk> milkList) {
        return storeService.saveAllMilk(milkList);
    }

    @PostMapping("/eggs/saveall")
    public Iterable<Eggs> saveAllEggs(@RequestBody Iterable<Eggs> eggList) {
        return storeService.saveAllEggs(eggList);
    }

    @PostMapping("/bread/saveall")
    public Iterable<Bread> saveAllBread(@RequestBody Iterable<Bread> breadList) {
        return storeService.saveAllBread(breadList);
    }

    @PostMapping("/chocolate/saveall")
    public Iterable<Chocolate> saveAllChocolate(@RequestBody Iterable<Chocolate> chocolateList) {
        return storeService.saveAllChocolate(chocolateList);
    }

    @PostMapping("/apple/saveall")
    public Iterable<Apple> saveAllApple(@RequestBody Iterable<Apple> appleList) {
        return storeService.saveAllApple(appleList);
    }

    // DELETE Mappings for deleting individual items by ID
    @DeleteMapping("/milkdelete/{id}")
    public void deleteMilk(@PathVariable Long id) {
        storeService.deleteMilk(id);
    }

    @DeleteMapping("/eggsdelete/{id}")
    public void deleteEggs(@PathVariable Long id) {
        storeService.deleteEggs(id);
    }

    @DeleteMapping("/breaddelete/{id}")
    public void deleteBread(@PathVariable Long id) {
        storeService.deleteBread(id);
    }

    @DeleteMapping("/chocolatedelete/{id}")
    public void deleteChocolate(@PathVariable Long id) {
        storeService.deleteChocolate(id);
    }

    @DeleteMapping("/appledelete/{id}")
    public void deleteApple(@PathVariable Long id) {
        storeService.deleteApple(id);
    }

    // PUT Mappings for updating individual items by ID
    @PutMapping("/milkUpdate/{id}")
    public Milk updateMilk(@PathVariable Long id, @RequestBody Milk milk) {
        return storeService.updateMilk(id, milk);
    }

    @PutMapping("/appleUpdate/{id}")
    public Apple updateApple(@PathVariable Long id, @RequestBody Apple apple) {
        return storeService.updateApple(id, apple);
    }

    @PutMapping("/chocolateUpdate/{id}")
    public Chocolate updateChocolate(@PathVariable Long id, @RequestBody Chocolate chocolate) {
        return storeService.updateChocolate(id, chocolate);
    }

    @PutMapping("/breadUpdate/{id}")
    public Bread updateBread(@PathVariable Long id, @RequestBody Bread bread) {
        return storeService.updateBread(id, bread);
    }

    @PutMapping("/eggsUpdate/{id}")
    public Eggs updateEggs(@PathVariable Long id, @RequestBody Eggs eggs) {
        return storeService.updateEggs(id, eggs);
    }

    // GET Mappings for retrieving individual items by ID
    @GetMapping("/milk/{id}")
    public Milk getMilkById(@PathVariable Long id) {
        return storeService.getMilkById(id);
    }

    @GetMapping("/apple/{id}")
    public Apple getAppleById(@PathVariable Long id) {
        return storeService.getAppleById(id);
    }

    @GetMapping("/chocolate/{id}")
    public Chocolate getChocolateById(@PathVariable Long id) {
        return storeService.getChocolateById(id);
    }

    @GetMapping("/bread/{id}")
    public Bread getBreadById(@PathVariable Long id) {
        return storeService.getBreadById(id);
    }

    @GetMapping("/eggs/{id}")
    public Eggs getEggsById(@PathVariable Long id) {
        return storeService.getEggsById(id);
    }
}
