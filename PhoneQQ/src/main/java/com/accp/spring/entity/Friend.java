package com.accp.spring.entity;
import java.util.Date;
public class Friend {
	private int friendId;
	private String friendName;
	private int userId;
	private int frienduserId;
	private int groupingId;
	private Date addTime;
	private String nickName;
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getFriendId() {
		return friendId;
	}
	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFrienduserId() {
		return frienduserId;
	}
	public void setFrienduserId(int frienduserId) {
		this.frienduserId = frienduserId;
	}
	public int getGroupingId() {
		return groupingId;
	}
	public void setGroupingId(int groupingId) {
		this.groupingId = groupingId;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
}
