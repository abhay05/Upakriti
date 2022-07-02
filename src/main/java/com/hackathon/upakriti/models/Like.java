package com.hackathon.upakriti.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Likes")
public class Like implements Serializable{
	private int like;
	@Id
	private String userid;
	@Id
	private String qrid;
	
	public Like(){}

	public Like(int like, String userid, String qrid) {
		super();
		this.like = like;
		this.userid = userid;
		this.qrid = qrid;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	@Override
	public String toString() {
		return "Like [like=" + like + ", userid=" + userid + ", qrid=" + qrid + "]";
	}
	
	
}
