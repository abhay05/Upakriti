package com.hackathon.upakriti.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Users")
public class User {
	@Id
	private String userId;
	private String name;
	private String emailId;
	private String teamId;
	
	public User() {}

	public User(String userId, String name, String emailId, String teamId) {
		super();
		this.userId = userId;
		this.name = name;
		this.emailId = emailId;
		this.teamId = teamId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", emailId=" + emailId + ", teamId=" + teamId + "]";
	}
	
	
}
