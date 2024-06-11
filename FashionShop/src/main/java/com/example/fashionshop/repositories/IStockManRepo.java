package com.example.fashionshop.repositories;

import com.example.fashionshop.entity.StockMan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStockManRepo extends JpaRepository<StockMan,Long> {
}
