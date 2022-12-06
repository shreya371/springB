package com.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.model.User;
import com.jobportal.repository.UserRepository;

@RestController

public class UserController {

	 @Autowired 
	    private UserRepository userRepo;
	      
	    // Save method is predefine method in Mongo Repository
	    // with this method we will save user in our database
	    @PostMapping("/addUser")
	    public User addUser(@RequestBody User user) {
	        return userRepo.save(new User(user.getId(),user.getName(),user.getRollNo()));
	    }
	      
	    // findAll method is predefine method in Mongo Repository 
	    // with this method we will all user that is save in our database
	    @GetMapping("/getAllUser")
	    public List<User> getAllUser(){
	        return userRepo.findAll(); 
	    }	    
	    
}
