package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.User;
import com.example.UserRepository;

@Service    // a
@Transactional    // b
public class UserService implements UserDetailsService{

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

    }
    @Autowired    // c
    private UserRepository repository;    // d

    @Autowired
    private PasswordEncoder passwordEncoder;

    // 顧客全件取得
    public List<User> findAll() {    // e
        return repository.findAll();
    }
}

