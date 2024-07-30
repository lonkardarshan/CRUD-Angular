package com.example.crud_Angular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud_Angular.entity.Customer;
import com.example.crud_Angular.repositoty.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public boolean createCustomer(Customer customer) {
         customerRepository.save(customer);
         return true;
    }

    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        updatedCustomer.setId(id);
        return customerRepository.save(updatedCustomer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public boolean deleteCustomer(Long id) {
        customerRepository.deleteById(id);
        return true;
    }
}
