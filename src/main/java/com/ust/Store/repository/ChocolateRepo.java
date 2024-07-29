package com.ust.Store.repository;


import com.ust.Store.model.Chocolate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChocolateRepo extends JpaRepository<Chocolate,Long> {
}
