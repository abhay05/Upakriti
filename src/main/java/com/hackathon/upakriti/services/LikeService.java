package com.hackathon.upakriti.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.hackathon.upakriti.repository.LikeDAOI;
import com.hackathon.upakriti.models.LikeCompositeKey;
import com.hackathon.upakriti.models.Like;

@Service
public class LikeService {
	@Autowired 
	LikeDAOI ldao;
	public void addLike(int cnt,String userid,String qrid) {
		int count=0;
		if(ldao.existsById(new LikeCompositeKey(userid,qrid))) {
		count=ldao.getLikeValue(userid,qrid);
		}
		if(cnt+count<2 && cnt+count>-2) {
		Like nl=new Like(count+cnt,userid,qrid);
		ldao.save(nl);
		}
		
		}
	
	public int getLikesByQrid(String qrid) {
		return ldao.getLikesByQrid(qrid);
	}
}
