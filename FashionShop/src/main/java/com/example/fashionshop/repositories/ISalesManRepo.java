package com.example.fashionshop.repositories;

import com.example.fashionshop.entity.SalesMan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISalesManRepo extends JpaRepository<SalesMan,Long> {
}
