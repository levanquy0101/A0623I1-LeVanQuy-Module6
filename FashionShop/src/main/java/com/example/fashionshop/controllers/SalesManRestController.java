package com.example.fashionshop.controllers;

import com.example.fashionshop.entities.SalesMan;
import com.example.fashionshop.services.ISalesManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/salesman")
@CrossOrigin(origins = "*")
public class SalesManRestController {
    @Autowired
    private ISalesManService iSalesManService;

    @GetMapping("")
    public ResponseEntity<List<SalesMan>> getAllSalesMan() {
        List<SalesMan> salesmans = iSalesManService.findAll();
        return new ResponseEntity<>(salesmans, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<SalesMan> createSalesMan(@RequestBody SalesMan salesman) {
        SalesMan createdSalesMan = iSalesManService.save(salesman);
        return new ResponseEntity<>(createdSalesMan, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<SalesMan> updateSalesMan(@PathVariable Long id, @RequestBody SalesMan salesman) {
        SalesMan updatedSalesMan = iSalesManService.update(id, salesman);
        return new ResponseEntity<>(updatedSalesMan, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSalesMan(@PathVariable Long id) {
        iSalesManService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

