package com.hackathon.upakriti.controllers;

import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;
import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hackathon.upakriti.repository.ReplyDAOI;
import com.hackathon.upakriti.forms.ReplyForm;
import com.hackathon.upakriti.models.Reply;

@RestController
public class ReplyController {
	@Autowired
	ReplyDAOI replyRepo;
	
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
	public List<Reply> getRepliesByQid(@PathVariable String qid){
		List<Reply> allReplies=replyRepo.findAllByQid(qid);
		return allReplies;
	}
	
	@CrossOrigin("*")
	@GetMapping("replies-userid/{userid}")
	public List<Reply> getRepliesByUserid(@PathVariable String userid){
		return replyRepo.findAllByUserid(userid);
	}
	
	// sorting usinng likes
	// sorint

}