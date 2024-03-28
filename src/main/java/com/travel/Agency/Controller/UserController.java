package com.travel.Agency.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.Agency.Entity.User;
import com.travel.Agency.Service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	public UserService userservice;
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
	return userservice.addUser(user);
	
	}
}
