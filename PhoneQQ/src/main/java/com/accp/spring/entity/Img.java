package com.accp.spring.entity;
public class Img {
	private int imgId;
	private String path;
	private int imgType;
	private int masterId;
	public int getImgId() {
		return imgId;
	}
	public void setImgId(int imgId) {
		this.imgId = imgId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getImgType() {
		return imgType;
	}
	public void setImgType(int imgType) {
		this.imgType = imgType;
	}
	public int getMasterId() {
		return masterId;
	}
	public void setMasterId(int masterId) {
		this.masterId = masterId;
	}
}
