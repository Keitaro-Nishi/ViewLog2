package com.example;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity    // a
@Table(name="userdata")    // b
@Data    // c
@AllArgsConstructor    // d
@NoArgsConstructor    // e
public class Customer {

    @Id
    @GeneratedValue
    private Integer no;

    @Column(nullable=false)
    private String custid;

    @Column(nullable=false)
    private String custname;

    @Column(nullable=false)
    private String orgname;

    @Column(nullable=false)
    private String reserve;
}

