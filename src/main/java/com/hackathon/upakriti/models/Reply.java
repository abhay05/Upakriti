package com.hackathon.upakriti.models;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Replies")
public class Reply {
	@Id
	private String rid;
	private String prid;
	private String qid;
	private String content;
	private String userid;
	private Timestamp crtts;
	private Timestamp updts;
	
	public Reply() {}
	
	public Reply(String rid, String prid, String qid, String content, String userid, Timestamp crtts, Timestamp updts) {
		super();
		this.rid = rid;
		this.prid = prid;
		this.qid = qid;
		this.content = content;
		this.userid = userid;
		this.crtts = crtts;
		this.updts = updts;
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

	@Override
	public String toString() {
		return "Reply [rid=" + rid + ", prid=" + prid + ", qid=" + qid + ", content=" + content + ", userid=" + userid
				+ ", crtts=" + crtts + ", updts=" + updts + "]";
	}
	
	
	
}
