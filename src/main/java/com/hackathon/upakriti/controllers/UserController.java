package com.hackathon.upakriti.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.hackathon.upakriti.forms.LoginForm;
import com.hackathon.upakriti.models.User;
import com.hackathon.upakriti.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService us;
	
	@GetMapping("user/{userid}")
	public Optional<User> getUser(@PathVariable String userid) {
		return us.getUser(userid);
	}
	
	@PostMapping("user")
	public void postUser(@RequestBody LoginForm login) {
		us.addUser(login);
	}
}
