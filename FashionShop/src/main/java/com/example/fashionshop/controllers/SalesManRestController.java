package com.example.fashionshop.controllers;

import com.example.fashionshop.entity.SalesMan;
import com.example.fashionshop.services.ISalesManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salesman")
@CrossOrigin(origins = "*")
public class SalesManRestController {
    @Autowired
    private ISalesManService iSalesManService;
    @GetMapping("")
    @ResponseBody
    public List<SalesMan> getAll() {
        return iSalesManService.findAll();
    }

    @PostMapping("/create")
    @ResponseBody
    public SalesMan createSalesMan(@RequestBody SalesMan salesman) {
        return iSalesManService.save(salesman);
    }


    @PutMapping("/update/{id}")
    @ResponseBody
    public SalesMan updateSalesMan(@PathVariable Long id, @RequestBody SalesMan salesman) {
        return iSalesManService.update(id, salesman);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteSalesMan(@PathVariable Long id) {
        iSalesManService.delete(id);
    }
}
