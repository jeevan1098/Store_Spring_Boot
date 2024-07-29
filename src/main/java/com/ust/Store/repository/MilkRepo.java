package com.ust.Store.repository;

import com.ust.Store.model.Milk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilkRepo extends JpaRepository<Milk,Long> {
}
