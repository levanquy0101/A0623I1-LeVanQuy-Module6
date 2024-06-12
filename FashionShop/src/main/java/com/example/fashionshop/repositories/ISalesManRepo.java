package com.example.fashionshop.repositories;

import com.example.fashionshop.entities.SalesMan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISalesManRepo extends JpaRepository<SalesMan,Long> {
}
