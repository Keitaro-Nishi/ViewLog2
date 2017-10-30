package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="userdata")
@Data    // a
@AllArgsConstructor  // b
@NoArgsConstructor // c
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int no;

	@Column(name="custid")
	private String custid;

	@Column(name="custname")
	private String custname;

	@Column(name="orgname")
	private String orgname;

	@Column(name="role")
	private String role;

	@Column(name="reserve")
	private String reserve;

}
