package com.hackathon.upakriti.controllers;

import com.hackathon.upakriti.forms.UserStats;
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
	
	@CrossOrigin("*")
	@GetMapping("user/{userid}")
	public Optional<User> getUser(@PathVariable String userid) {
		return us.getUser(userid);
	}
	
	@CrossOrigin("*")
	@PostMapping("user")
	public void postUser(@RequestBody LoginForm login) {
		us.addUser(login);
	}
	
	@CrossOrigin("*")
	@GetMapping("getUserStats/{userid}")
	public Optional<UserStats> getUserStats(@PathVariable String userid){
		return us.getStats(userid);
	}
}
