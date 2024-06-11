package com.example.fashionshop.services;

import com.example.fashionshop.entity.SalesMan;
import com.example.fashionshop.entity.StockMan;

import java.util.List;

public interface IStockManService {

    List<StockMan> findAll();

    StockMan save(StockMan stockman);

    StockMan update(Long id, StockMan stockman);

    void delete(Long id);
}
