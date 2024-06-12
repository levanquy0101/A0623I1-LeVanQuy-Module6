package com.example.fashionshop.controllers;

import com.example.fashionshop.entities.StockMan;
import com.example.fashionshop.services.IStockManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stockman")
@CrossOrigin(origins = "*")
public class StockManRestController {
    @Autowired
    private IStockManService iStockManService;

    @GetMapping("")
    @ResponseBody
    public List<StockMan> getAll() {
        return iStockManService.findAll();
    }

    @PostMapping("/create")
    @ResponseBody
    public StockMan createStockMan(@RequestBody StockMan stockman) {
        return iStockManService.save(stockman);
    }
    @PutMapping("/update/{id}")
    @ResponseBody
    public StockMan updateStockMan(@PathVariable Long id, @RequestBody StockMan stockman) {
        return iStockManService.update(id, stockman);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteStockMan(@PathVariable Long id) {
        iStockManService.delete(id);
    }
}
