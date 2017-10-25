package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tools.springsample.springsample04.domain.Customer;
import tools.springsample.springsample04.repository.CustomerRepository;

@Service    // a
@Transactional    // b
public class CustomerService {
    @Autowired    // c
    CustomerRepository repository;    // d

    // 顧客全件取得
    public List<Customer> findAll() {    // e
        return repository.findAll();
    }
/*
    // 顧客一件取得
    public Customer findOne(Integer id) {    // f
        return repository.findOne(id);
    }

    // 顧客一件作成
    public Customer create(Customer customer) {    // g
        return repository.save(customer);
    }

    // 顧客一件更新
    public Customer update(Customer customer) {    // h
        return repository.save(customer);
    }

    // 顧客一件削除
    public void delete(Integer id) {    // i
        repository.delete(id);
    }
*/
}
