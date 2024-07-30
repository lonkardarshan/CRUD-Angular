package com.example.crud_Angular.repositoty;  // Ensure this matches in both files

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud_Angular.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
