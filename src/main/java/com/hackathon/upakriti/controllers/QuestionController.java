package com.hackathon.upakriti.controllers;

import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.hackathon.upakriti.repository.QuestionDAOI;
import com.hackathon.upakriti.repository.LikeDAOI;
import com.hackathon.upakriti.models.Question;
import com.hackathon.upakriti.forms.QuestionForm;
import com.hackathon.upakriti.forms.QuestionWLikes;

import java.util.Optional;

@RestController
public class QuestionController {
	@Autowired
	QuestionDAOI questionRepo;
	
	@Autowired
	LikeDAOI likesRepo;
	
	@CrossOrigin("*")
	@PostMapping("add-question")
	public void addQuestion(@RequestBody QuestionForm question) {
		UUID uuid = UUID.randomUUID();
		Date date=new Date();
		
		Question ques=new Question(uuid.toString(),question.getTagid(),question.getUserid(),question.getTitle(),question.getDescription(),new Timestamp(date.getTime()),new Timestamp(date.getTime()));
		System.out.println(ques.toString());
		questionRepo.save(ques);
	}
	
	@CrossOrigin("*")
	@GetMapping("questions-userid/{userid}")
	public List<Question> getQuestionsByUserid(@PathVariable String userid){
		return questionRepo.findAllByUserid(userid);
	}
	
	@CrossOrigin("*")
	@GetMapping("/questions")
	public List<QuestionWLikes> getAllQuestions(){
		List<Question> questions=questionRepo.getAllQuestions();
		List<QuestionWLikes> qla=new ArrayList<QuestionWLikes>();
		for(Question qu:questions){
			Optional<Integer> likes=likesRepo.getLikesByQrid(qu.getQid());
			Optional<Integer> dislikes=likesRepo.getDislikesByQrid(qu.getQid());
			QuestionWLikes ql=new QuestionWLikes(qu.getQid(),qu.getTagid(),qu.getUserid(),qu.getTitle(),qu.getDescription(),qu.getCrtts(),qu.getUpdts(),likes,dislikes);
			qla.add(ql);
		}
		return qla;
	}
	
	//get all questions
	// sorted with timestamp
	//question id
	
}
