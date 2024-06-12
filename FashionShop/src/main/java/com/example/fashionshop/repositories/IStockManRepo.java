package com.example.fashionshop.repositories;

import com.example.fashionshop.entities.StockMan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStockManRepo extends JpaRepository<StockMan,Long> {
}
