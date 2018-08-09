package com.accp.spring.entity;

import java.util.Date;

public class Reply {
	private int replyId;
	private int userId;
	private int pasvuserId;
	private String replycontent;
	private Date replyTime;
	private int discussId;
	private Users users;
	
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPasvuserId() {
		return pasvuserId;
	}
	public void setPasvuserId(int pasvuserId) {
		this.pasvuserId = pasvuserId;
	}
	public String getReplycontent() {
		return replycontent;
	}
	public void setReplycontent(String replycontent) {
		this.replycontent = replycontent;
	}
	public Date getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
	public int getDiscussId() {
		return discussId;
	}
	public void setDiscussId(int discussId) {
		this.discussId = discussId;
	}
	@Override
	public String toString() {
		return "Reply [replyId=" + replyId + ", userId=" + userId + ", pasvuserId=" + pasvuserId + ", replycontent="
				+ replycontent + ", replyTime=" + replyTime + ", discussId=" + discussId + ", users=" + users + "]";
	}
}
