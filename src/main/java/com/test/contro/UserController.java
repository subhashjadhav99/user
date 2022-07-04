package com.test.contro;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.test.mod.User;
import com.test.ser.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
	private UserService userservice;
    
    @PostMapping("/save")
    public User saveUser(User user) {
    	return userservice.saveUser(user);
    }
    @GetMapping("/get")
  public User findUserById(@PathVariable ("id")int id) {
	  return userservice.findUserById(id);
  }
    
}
