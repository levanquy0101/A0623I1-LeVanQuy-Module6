package com.example.fashionshop.services;

import com.example.fashionshop.entity.Customer;
import com.example.fashionshop.entity.SalesMan;

import java.util.List;

public interface ISalesManService {

    List<SalesMan> findAll();

    SalesMan save(SalesMan salesman);

    SalesMan update(Long id, SalesMan salesman);

    void delete(Long id);
}
