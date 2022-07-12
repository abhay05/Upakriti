package com.hackathon.upakriti.controllers;

import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.hackathon.upakriti.repository.LikeDAOI;
import com.hackathon.upakriti.repository.ReplyDAOI;
import com.hackathon.upakriti.forms.ReplyForm;
import com.hackathon.upakriti.forms.ReplyWLikes;
import com.hackathon.upakriti.models.Reply;

@RestController
public class ReplyController {
	@Autowired
	ReplyDAOI replyRepo;
	
	@Autowired
	LikeDAOI likesRepo;
	
	@CrossOrigin("*")
	@PostMapping("post-reply")
	public void postReply(@RequestBody ReplyForm reply) {
		UUID uuid = UUID.randomUUID();
		Date date=new Date();
		Reply rep=new Reply(uuid.toString(),reply.getPrid(),reply.getQid(),reply.getContent(),reply.getUserid(),new Timestamp(date.getTime()),new Timestamp(date.getTime()));
		replyRepo.save(rep);
	}
	
	@CrossOrigin("*")
	@GetMapping("reply/{rid}")
	public Optional<Reply> getReply(@PathVariable String rid) {
		Optional<Reply> rep= replyRepo.findById(rid);
		return rep;
	}
	
	@CrossOrigin("*")
	@GetMapping("replies-qid/{qid}")
	public List<ReplyWLikes> getRepliesByQid(@PathVariable String qid){
		List<Reply> allReplies=replyRepo.findAllByQid(qid);
		List<ReplyWLikes> rla=new ArrayList<ReplyWLikes>();
		for(Reply re:allReplies) {
			Optional<Integer> likes=likesRepo.getLikesByQrid(re.getRid());
			Optional<Integer> dislikes=likesRepo.getDislikesByQrid(re.getRid());
			ReplyWLikes rl=new ReplyWLikes(re.getRid(),re.getPrid(),re.getQid(),re.getContent(),re.getUserid(),re.getCrtts(),re.getUpdts(),likes,dislikes);
			rla.add(rl);
		}
		return rla;
	}
	
	@CrossOrigin("*")
	@GetMapping("replies-userid/{userid}")
	public List<Reply> getRepliesByUserid(@PathVariable String userid){
		return replyRepo.findAllByUserid(userid);
	}
	
	// sorting usinng likes
	// sorint

}