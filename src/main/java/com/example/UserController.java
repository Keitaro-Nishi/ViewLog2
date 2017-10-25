/*
package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import src.main.java.com.example.Customer;
import src.main.java.com.example.CustomerService;

@RestController    // a
@RequestMapping("api/customer")    // b
public class CustomerRestController {
    @Autowired    // c
    CustomerService service;    // d

    // 顧客全件取得
    @RequestMapping(method=RequestMethod.GET)    // e
    public List<Customer> getCustomer() {
        return service.findAll();
    }
/*
    // 顧客一件取得
    @RequestMapping(method=RequestMethod.GET, value="{no}")    // f
    public Customer getCustomer(@PathVariable Integer no) {
        return service.findOne(id);
    }

    // 顧客一件作成
    @RequestMapping(method=RequestMethod.POST)    // g
    @ResponseStatus(HttpStatus.CREATED)    // h
    public Customer postCustomer(@RequestBody Customer customer) {
        return service.create(customer);
    }

    // 顧客一件更新
    @RequestMapping(method=RequestMethod.PUT, value="{no}")    // i
    public Customer putCustomer(@PathVariable Integer no,
                                @RequestBody Customer customer) {
        customer.setId(no);
        return service.update(customer);
    }

    // 顧客一件削除
    @RequestMapping(method=RequestMethod.DELETE, value="{no}")    // j
    @ResponseStatus(HttpStatus.NO_CONTENT)    // k
    public void deleteCustomer(@PathVariable Integer no) {
        service.delete(no);
    }

}
*/
