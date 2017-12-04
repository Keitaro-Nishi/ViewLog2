package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService  {
	
	@Autowired
	private UserRepository repository;
	
	@Transactional
    public void registerUser(Integer no,String userid, String username, String orgname, String password, String effect, String auth) {
		User user = new User(no,userid,username,orgname,password,effect,auth);
        repository.save(user);
    }

}