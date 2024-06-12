package com.example.fashionshop.repositories;

import com.example.fashionshop.entities.ProductTarget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductTargetRepo extends JpaRepository<ProductTarget, Long> {
}
