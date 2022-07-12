package com.hackathon.upakriti.forms;

import java.sql.Timestamp;
import java.util.Optional;

import javax.persistence.Entity;
import java.util.Optional;

public class QuestionWLikes {
	private String qid;
	private String tagid;
	private String userid;
	private String title;
	private String description;
	public String getQid() {
		return qid;
	}
	public void setQid(String qid) {
		this.qid = qid;
	}
	public String getTagid() {
		return tagid;
	}
	public void setTagid(String tagid) {
		this.tagid = tagid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getCrtts() {
		return crtts;
	}
	public void setCrtts(Timestamp crtts) {
		this.crtts = crtts;
	}
	public Timestamp getUpdts() {
		return updts;
	}
	public void setUpdts(Timestamp updts) {
		this.updts = updts;
	}
	public Optional<Integer> getLikes() {
		return likes;
	}
	public void setLikes(Optional<Integer> likes) {
		this.likes = likes;
	}
	public Optional<Integer> getDislikes() {
		return dislikes;
	}
	public void setDislikes(Optional<Integer> dislikes) {
		this.dislikes = dislikes;
	}
	private Timestamp crtts;
	private Timestamp updts;
	private Optional<Integer> likes;
	private Optional<Integer> dislikes;
	public QuestionWLikes(String qid, String tagid, String userid, String title, String description, Timestamp crtts,
			Timestamp updts, Optional<Integer> likes, Optional<Integer> dislikes) {
		super();
		this.qid = qid;
		this.tagid = tagid;
		this.userid = userid;
		this.title = title;
		this.description = description;
		this.crtts = crtts;
		this.updts = updts;
		this.likes = likes;
		this.dislikes = dislikes;
	}
	@Override
	public String toString() {
		return "QuestionWLikes [qid=" + qid + ", tagid=" + tagid + ", userid=" + userid + ", title=" + title
				+ ", description=" + description + ", crtts=" + crtts + ", updts=" + updts + ", likes=" + likes
				+ ", dislikes=" + dislikes + "]";
	}
	
	
	
}
