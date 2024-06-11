package com.example.fashionshop.repositories;

import com.example.fashionshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product, Long> {
}
