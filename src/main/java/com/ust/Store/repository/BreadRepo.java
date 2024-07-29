package com.ust.Store.repository;


import com.ust.Store.model.Bread;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreadRepo extends JpaRepository<Bread,Long> {
}
