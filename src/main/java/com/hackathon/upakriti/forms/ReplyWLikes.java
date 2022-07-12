package com.hackathon.upakriti.forms;

import java.sql.Timestamp;
import java.util.Optional;

public class ReplyWLikes {
	private String rid;
	private String prid;
	private String qid;
	private String content;
	private String userid;
	private Timestamp crtts;
	private Timestamp updts;
	private Optional<Integer> likes;
	private Optional<Integer> dislikes;
	public ReplyWLikes(String rid, String prid, String qid, String content, String userid, Timestamp crtts,
			Timestamp updts, Optional<Integer> likes, Optional<Integer> dislikes) {
		super();
		this.rid = rid;
		this.prid = prid;
		this.qid = qid;
		this.content = content;
		this.userid = userid;
		this.crtts = crtts;
		this.updts = updts;
		this.likes = likes;
		this.dislikes = dislikes;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getPrid() {
		return prid;
	}
	public void setPrid(String prid) {
		this.prid = prid;
	}
	public String getQid() {
		return qid;
	}
	public void setQid(String qid) {
		this.qid = qid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
	@Override
	public String toString() {
		return "ReplyWLikes [rid=" + rid + ", prid=" + prid + ", qid=" + qid + ", content=" + content + ", userid="
				+ userid + ", crtts=" + crtts + ", updts=" + updts + ", likes=" + likes + ", dislikes=" + dislikes
				+ "]";
	}
	
	
}
