package com.hackathon.upakriti.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Table(name="Likes")
@IdClass(LikeCompositeKey.class)
public class Like{
	private int likeValue;
	@Id
	private String userid;
	@Id
	private String qrid;
	
	public Like(){}

	public Like(int likeValue, String userid, String qrid) {
		super();
		this.likeValue = likeValue;
		this.userid = userid;
		this.qrid = qrid;
	}

	public int getLikeValue() {
		return likeValue;
	}

	public void setLikeValue(int likeValue) {
		this.likeValue = likeValue;
	}

	@Override
	public String toString() {
		return "Like [like=" + likeValue + ", userid=" + userid + ", qrid=" + qrid + "]";
	}
	
	
}
