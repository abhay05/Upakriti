package com.hackathon.upakriti.controllers;

import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.hackathon.upakriti.repository.QuestionDAOI;
import com.hackathon.upakriti.models.Question;
import com.hackathon.upakriti.forms.QuestionForm;

@RestController
public class QuestionController {
	@Autowired
	QuestionDAOI questionRepo;
	
	@PutMapping("add-question")
	public void addQuestion(@RequestBody QuestionForm question) {
		UUID uuid = UUID.randomUUID();
		Date date=new Date();
		
		Question ques=new Question(uuid.toString(),question.getTagid(),question.getUserid(),question.getTitle(),question.getDescription(),new Timestamp(date.getTime()),new Timestamp(date.getTime()));
		
		questionRepo.save(ques);
	}
}
