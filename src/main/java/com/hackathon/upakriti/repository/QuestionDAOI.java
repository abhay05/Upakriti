package com.hackathon.upakriti.repository;

import java.util.List;

import com.hackathon.upakriti.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface QuestionDAOI extends JpaRepository<Question,String>{
	@Query("select q from Question q where userid = ?1")
	public List<Question> findAllByUserid(String userid);
	
	@Query("select q from Question q")
	public List<Question> getAllQuestions();
}
