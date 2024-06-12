package com.example.fashionshop.services;

import com.example.fashionshop.entities.StockMan;

import java.util.List;

public interface IStockManService {

    List<StockMan> findAll();

    StockMan save(StockMan stockman);

    StockMan update(Long id, StockMan stockman);

    void delete(Long id);
}
