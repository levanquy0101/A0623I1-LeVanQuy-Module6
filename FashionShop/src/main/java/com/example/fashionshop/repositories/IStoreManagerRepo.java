package com.example.fashionshop.repositories;

import com.example.fashionshop.entities.StoreManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStoreManagerRepo extends JpaRepository<StoreManager,Long> {
}
