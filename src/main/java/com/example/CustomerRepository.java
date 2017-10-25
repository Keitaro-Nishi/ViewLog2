package com.example;

import tools.springsample.springsample04.domain.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository
    extends JpaRepository<Customer, Integer> {    // a
}
