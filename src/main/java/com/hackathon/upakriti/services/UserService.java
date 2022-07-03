package com.hackathon.upakriti.services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.hackathon.upakriti.repository.UserDAOI;
import com.hackathon.upakriti.forms.LoginForm;
import com.hackathon.upakriti.models.User;

@Service
public class UserService {
	
	@Autowired
	UserDAOI udao;
	
	public Optional<User> getUser(String userid) {
		return udao.findById(userid);
	}
	
	public void addUser(LoginForm login) {
		udao.save(new User(login.getUserId(),login.getName(),login.getEmailId(),login.getTeamId()));
	}
}
