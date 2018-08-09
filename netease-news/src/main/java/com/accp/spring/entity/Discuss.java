package com.accp.spring.entity;

import java.util.Date;
import java.util.List;

public class Discuss {
	private int discussId;
	private int newsId;
	private String commentText;
	private int userId;
	private Date discussTime;
	private String nickName;
	
	private List<Reply> listReply;
	
	public List<Reply> getListReply() {
		return listReply;
	}
	public void setListReply(List<Reply> listReply) {
		this.listReply = listReply;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
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
				+ userId + ", discussTime=" + discussTime + ", listReply=" + listReply + ", nickName=" + nickName + "]";
	}
	
}
