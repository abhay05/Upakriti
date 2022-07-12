package com.hackathon.upakriti.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.hackathon.upakriti.services.LikeService;

@RestController
public class LikeController {
	
	@Autowired
	LikeService ls;
	
	@CrossOrigin("*")
	@PostMapping("like/{qrid}/{userid}")
	public void postLike(@PathVariable String qrid, @PathVariable String userid) {
		ls.addLike(1,userid,qrid);
	}
	
	@CrossOrigin("*")
	@PostMapping("dislike/{qrid}/{userid}")
	public void postDislike(@PathVariable String qrid, @PathVariable String userid) {
		ls.addLike(-1,userid,qrid);
	}
	
//	@GetMapping("likes/{qrid}")
//	public int getLikes(@PathVariable String qrid) {
//		return ls.getLikesByQrid(qrid);
//	}
}
