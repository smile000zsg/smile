package com.accp.spring.entity;

public class Space {
	private int spaceId;
	private String backColor;
	private String signature;
	private int backImgId;
	private int userId;
	public int getSpaceId() {
		return spaceId;
	}
	public void setSpaceId(int spaceId) {
		this.spaceId = spaceId;
	}
	public String getBackColor() {
		return backColor;
	}
	public void setBackColor(String backColor) {
		this.backColor = backColor;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public int getBackImgId() {
		return backImgId;
	}
	public void setBackImgId(int backImgId) {
		this.backImgId = backImgId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
