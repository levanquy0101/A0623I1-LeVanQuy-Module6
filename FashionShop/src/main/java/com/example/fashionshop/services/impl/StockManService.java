package com.example.fashionshop.services.impl;
import com.example.fashionshop.entity.StockMan;
import com.example.fashionshop.repositories.IStockManRepo;
import com.example.fashionshop.services.IStockManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockManService implements IStockManService {
    @Autowired
    private IStockManRepo iStockManRepo;

    @Override
    public List<StockMan> findAll() {
        return iStockManRepo.findAll();
    }

    @Override
    public StockMan save(StockMan stockman) {
        return iStockManRepo.save(stockman);
    }

    @Override
    public StockMan update(Long id, StockMan stockman) {
        if (iStockManRepo.existsById(id)) {
            return iStockManRepo.save(stockman);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        if (iStockManRepo.existsById(id)) {
            iStockManRepo.deleteById(id);
        }
        else {
            System.out.println("Không thể xóa đối tượng");
        }
    }
}
