package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.UserDto;
import com.example.entity.User;
import com.example.service.impl.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@PostMapping("/users")
	public UserDto addUser(@RequestBody User user) {
		 return userServiceImpl.createUser(user);
		
	}
	
	
	

}
