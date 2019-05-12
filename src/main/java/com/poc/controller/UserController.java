package com.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.model.UserRequest;
import com.poc.model.UserResponse;
import com.poc.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/createUser")
	public UserResponse createUser(@RequestBody UserRequest user) {
		return userService.createUser(user);

	}

}
