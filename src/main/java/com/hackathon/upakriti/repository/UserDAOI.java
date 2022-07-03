package com.hackathon.upakriti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hackathon.upakriti.models.User;

@Repository
public interface UserDAOI extends JpaRepository<User,String> {

}
