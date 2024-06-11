package com.example.fashionshop.services.impl;
import com.example.fashionshop.entity.SalesMan;
import com.example.fashionshop.repositories.ISalesManRepo;
import com.example.fashionshop.services.ISalesManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesManService implements ISalesManService {
    @Autowired
    private ISalesManRepo iSalesManRepo;

    @Override
    public List<SalesMan> findAll() {
        return iSalesManRepo.findAll();
    }

    @Override
    public SalesMan save(SalesMan salesman) {
        return iSalesManRepo.save(salesman);
    }

    @Override
    public SalesMan update(Long id, SalesMan salesman) {
        if (iSalesManRepo.existsById(id)) {
            return iSalesManRepo.save(salesman);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        if (iSalesManRepo.existsById(id)) {
            iSalesManRepo.deleteById(id);
        }
        else {
            System.out.println("Không thể xóa đối tượng");
        }
    }
}
