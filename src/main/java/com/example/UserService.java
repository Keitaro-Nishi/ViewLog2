package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.User;
import com.example.UserRepository;

@Service    // a
@Transactional    // b
public class UserService {

    @Autowired    // c
    UserRepository repository;    // d

    // 顧客全件取得
    public List<User> findAll() {    // e
        return repository.findAll();
    }
}

