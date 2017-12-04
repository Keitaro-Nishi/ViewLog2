package com.example.demo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the springuser database table.
 * 
 */
@Entity
@Table(name="userdata")
//@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer no;

	private String userid;

	private String username;

	private String orgname;

	private String password;

	private String effect;

	private String auth;


	
	public User() {
	}
	
	public User(Integer no, String userid, String username, String orgname, String password, String effect, String auth) {
        this.no = no;
        this.userid = userid;
        this.username = username;
        this.orgname = orgname;
        this.password = password;
        this.effect = effect;
        this.auth = auth;
    }
	

	public Integer getNo() {
		return this.no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getOrgname() {
		return this.orgname;
	}

	public void setOrgrname(String orgname) {
		this.orgname = orgname;
	}
	
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEffect() {
		return this.effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}
	
	public String getAuth() {
		return this.auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}
}