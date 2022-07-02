package com.hackathon.upakriti.repository;


import com.hackathon.upakriti.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDAOI extends JpaRepository<Question,String>{

}
