package com.hackathon.upakriti.forms;

import java.sql.Timestamp;

public class QuestionForm {
	private String tagid;
	private String userid;
	private String title;
	private String description;
	
	public QuestionForm(String tagid, String userid, String title, String description) {
		super();
		this.tagid = tagid;
		this.userid = userid;
		this.title = title;
		this.description = description;
	}

	public String getTagid() {
		return tagid;
	}

	public String getUserid() {
		return userid;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}
	
	
}
