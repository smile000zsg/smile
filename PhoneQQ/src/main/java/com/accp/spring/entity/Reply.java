package com.accp.spring.entity;
import java.util.Date;
public class Reply {
	private int replyId;
	private int userId;
	private int pasvuserId;
	private String replyText;
	private Date replyTime;
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
	public String getReplyText() {
		return replyText;
	}
	public void setReplyText(String replyText) {
		this.replyText = replyText;
	}
	public Date getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
}
