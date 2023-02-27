package com.sachinlakshitha.springbootjpaonetomany.repository;

import com.sachinlakshitha.springbootjpaonetomany.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
