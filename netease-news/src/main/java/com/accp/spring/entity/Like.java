package com.accp.spring.entity;

import java.util.Date;

public class Like {
	private int likeId;
	private int userId;
	private Date likeTime;
	public int getLikeId() {
		return likeId;
	}
	public void setLikeId(int likeId) {
		this.likeId = likeId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getLikeTime() {
		return likeTime;
	}
	public void setLikeTime(Date likeTime) {
		this.likeTime = likeTime;
	}
	@Override
	public String toString() {
		return "Like [likeId=" + likeId + ", userId=" + userId + ", likeTime=" + likeTime + "]";
	}
	
}
