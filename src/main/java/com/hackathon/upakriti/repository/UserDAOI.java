package com.hackathon.upakriti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hackathon.upakriti.models.User;

@Repository
public interface UserDAOI extends JpaRepository<User,String> {
	@Query("select count(*) from Question q where userid = ?1")
	public int questionCount(String userid);
	
	@Query("select count(*) from Reply r where userid = ?1")
	public int answersCount(String userid);
	
	@Query("select count(*) from Like l where userid=?1 and likeValue>0")
	public int likesCount(String userid);
	
	@Query("select count(*) from Like l where userid=?1 and likeValue<0")
	public int dislikesCount(String userid);
	
	@Query("select count(*) from Like l join Question q on (l.qrid=q.qid) where q.userid=?1")
	public int qlikesCount(String userid);
}
