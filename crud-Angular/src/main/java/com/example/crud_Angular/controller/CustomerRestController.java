package com.example.crud_Angular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.crud_Angular.entity.Customer;
import com.example.crud_Angular.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin("http://localhost:4200")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public boolean createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
    	System.out.println(id);
    	System.out.println(customer);
        return customerService.updateCustomer(id, customer);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCustomer(@PathVariable Long id) {
       return  customerService.deleteCustomer(id);
    }
}
