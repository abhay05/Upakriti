package com.hackathon.upakriti.forms;

public class ReplyForm {
	private String prid;
	private String qid;
	private String content;
	private String userid;
	public ReplyForm(String prid, String qid, String content, String userid) {
		this.prid = prid;
		this.qid = qid;
		this.content = content;
		this.userid = userid;
	}
	public String getPrid() {
		return prid;
	}
	public String getQid() {
		return qid;
	}
	public String getContent() {
		return content;
	}
	public String getUserid() {
		return userid;
	}
	
	
}
