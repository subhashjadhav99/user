package com.test.ser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mod.User;
import com.test.mod.UserRepository;

@Service
public class UserService {
    @Autowired
	private UserRepository userrepository;
 
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userrepository.save(user);
	}

	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userrepository.findByUserId(id);
	}

	
}
