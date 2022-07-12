package com.hackathon.upakriti.forms;

public class UserStats {
	private int rewardPoints;
	private int totalQuestions;
	private int totalReplies;
	private int totalLikes;
	private int totalDislikes;
	public UserStats(int rewardPoints, int totalQuestions, int totalReplies, int totalLikes, int totalDislikes) {
		super();
		this.rewardPoints = rewardPoints;
		this.totalQuestions = totalQuestions;
		this.totalReplies = totalReplies;
		this.totalLikes = totalLikes;
		this.totalDislikes = totalDislikes;
	}
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	public int getTotalQuestions() {
		return totalQuestions;
	}
	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}
	public int getTotalReplies() {
		return totalReplies;
	}
	public void setTotalReplies(int totalReplies) {
		this.totalReplies = totalReplies;
	}
	public int getTotalLikes() {
		return totalLikes;
	}
	public void setTotalLikes(int totalLikes) {
		this.totalLikes = totalLikes;
	}
	public int getTotalDislikes() {
		return totalDislikes;
	}
	public void setTotalDislikes(int totalDislikes) {
		this.totalDislikes = totalDislikes;
	}
	
	
}
