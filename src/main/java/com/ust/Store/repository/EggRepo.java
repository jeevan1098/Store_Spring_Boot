package com.ust.Store.repository;


import com.ust.Store.model.Eggs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EggRepo extends JpaRepository<Eggs,Long> {
}
