package com.hackathon.upakriti.services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.hackathon.upakriti.repository.UserDAOI;
import com.hackathon.upakriti.forms.LoginForm;
import com.hackathon.upakriti.models.User;
import com.hackathon.upakriti.forms.UserStats;

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
	
	public Optional<UserStats>getStats(String userid){
		int questionsCnt=udao.questionCount(userid);
		int answersCnt=udao.answersCount(userid);
		int likesCnt=udao.likesCount(userid);
		int qlikesCnt=udao.qlikesCount(userid);
		int dislikesCnt=udao.dislikesCount(userid);
		int rewardsPoints=qlikesCnt*5 + (likesCnt-qlikesCnt)*10;
		UserStats ust=new UserStats(rewardsPoints,questionsCnt,answersCnt,likesCnt,dislikesCnt);
		return Optional.ofNullable(ust);
	}
}
