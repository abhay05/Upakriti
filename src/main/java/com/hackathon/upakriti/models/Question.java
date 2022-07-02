package com.hackathon.upakriti.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Column; // needed only if column name is different from field name
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Questions")
public class Question {
	@Id
	private String qid;
	private String tagid;
	private String userid;
	private String title;
	private String description;
	private Timestamp crtts;
	private Timestamp updts;
	
	public Question() {}
	
	public Question(String qid, String tagid, String userid, String title, String description, Timestamp crtts,
			Timestamp updts) {
		
		this.qid = qid;
		this.tagid = tagid;
		this.userid = userid;
		this.title = title;
		this.description = description;
		this.crtts = crtts;
		this.updts = updts;
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

	public String getTitle() {
		return title;
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

	public Timestamp getUpdts() {
		return updts;
	}
	public void setUpdts(Timestamp updts) {
		this.updts = updts;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", tagid=" + tagid + ", userid=" + userid + ", title=" + title
				+ ", description=" + description + ", crtts=" + crtts + ", updts=" + updts + "]";
	}
	
	
	
}
