package com.example.fashionshop.controllers;

import com.example.fashionshop.entity.Customer;
import com.example.fashionshop.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin(origins = "*")
public class CustomerRestController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("")
    @ResponseBody
    public List<Customer> getAll() {
        return iCustomerService.findAll();
    }

    @PostMapping("/create")
    @ResponseBody
    public Customer createCustomer(@RequestBody Customer customer) {
        return iCustomerService.save(customer);
    }

    @PutMapping("/update/{id}")
    @ResponseBody
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return iCustomerService.update(id, customer);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteCustomer(@PathVariable Long id) {
        iCustomerService.delete(id);
    }
}
