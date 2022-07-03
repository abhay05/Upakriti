package com.hackathon.upakriti.forms;

public class LoginForm {
	private String userId;
	private String name;
	private String emailId;
	private String teamId;
	public LoginForm(String userId, String name, String emailId, String teamId) {
		super();
		this.userId = userId;
		this.name = name;
		this.emailId = emailId;
		this.teamId = teamId;
	}
	
	public LoginForm() {}

	public String getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getTeamId() {
		return teamId;
	}
	
	
}
