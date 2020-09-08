package com.etoak.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.etoak.service.UserService;

public class UserController {
	
	@Autowired
	UserService userService;
	
	public void addUser() {
		userService.addUser();
	}
}
