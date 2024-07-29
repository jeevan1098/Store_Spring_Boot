package com.ust.Store.repository;

import com.ust.Store.model.Apple;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppleRepo extends JpaRepository<Apple,Long> {
}
