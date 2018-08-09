package com.accp.spring.entity;

import java.util.Date;
import java.util.List;

public class Discuss {
	private int discussId;
	private int newsId;
	private String commentText;
	private int userId;
	private Date discussTime;
	private List<Reply> reply;
	private Users users;
	
	public List<Reply> getReply() {
		return reply;
	}
	public void setReply(List<Reply> reply) {
		this.reply = reply;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public int getDiscussId() {
		return discussId;
	}
	public void setDiscussId(int discussId) {
		this.discussId = discussId;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getDiscussTime() {
		return discussTime;
	}
	public void setDiscussTime(Date discussTime) {
		this.discussTime = discussTime;
	}
	@Override
	public String toString() {
		return "Discuss [discussId=" + discussId + ", newsId=" + newsId + ", commentText=" + commentText + ", userId="
				+ userId + ", discussTime=" + discussTime + ", reply=" + reply + ", users=" + users + "]";
	}
}
