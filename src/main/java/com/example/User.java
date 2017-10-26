package com.example;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data    // a
@AllArgsConstructor  // b
@NoArgsConstructor  // c
public class Customer {
    private Integer id;
    private String name;
    private String email;
}