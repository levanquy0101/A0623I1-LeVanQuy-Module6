package com.example.fashionshop.services.impl;

import com.example.fashionshop.repositories.IProductTargetRepo;
import com.example.fashionshop.services.IProductTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTargetService implements IProductTargetService {
    @Autowired
    private IProductTargetRepo iProductTargetRepo;
}
