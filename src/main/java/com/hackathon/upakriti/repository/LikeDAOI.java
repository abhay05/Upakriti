package com.hackathon.upakriti.repository;


import java.util.Optional;
import com.hackathon.upakriti.models.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.hackathon.upakriti.models.LikeCompositeKey;

@Repository
public interface LikeDAOI extends JpaRepository<Like,LikeCompositeKey> {
	@Query("select q.likeValue from Like q where userid = ?1 and qrid=?2")
	public int getLikeValue(String userid,String qrid);
	
	@Query("select coalesce(sum(q.likeValue),0) from Like q where qrid=?1 and likeValue>=0")
	public Optional<Integer> getLikesByQrid(String qrid);
//	
	@Query("select coalesce(sum(q.likeValue),0) from Like q where qrid=?1 and likeValue<=0")
	public Optional<Integer> getDislikesByQrid(String qrid);
}
