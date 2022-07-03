package com.hackathon.upakriti.repository;

import java.util.List;

import com.hackathon.upakriti.models.Reply;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface ReplyDAOI extends JpaRepository<Reply,String> {
	@Query("select r from Reply r where qid = ?1")
	List<Reply> findAllByQid(String qid);
	
	@Query("select r from Reply r where userid = ?1")
	List<Reply> findAllByUserid(String userid);
}
