/*
package com.example;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "userdata")
@Data
public class Account implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable=false)
    private String email;

    @Column(nullable=false, length=20)
    private String password;

    @Column(nullable=false, updatable=false)
    private Date created_at;

    @Column(nullable=false)
    private Date updated_at;
}
*/
