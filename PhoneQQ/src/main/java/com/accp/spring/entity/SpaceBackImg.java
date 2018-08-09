package com.accp.spring.entity;
import java.util.Date;
public class SpaceBackImg {
	private int backImgId;
	private String path;
	private int spaceId;
	private Date setTime;
	public int getBackImgId() {
		return backImgId;
	}
	public void setBackImgId(int backImgId) {
		this.backImgId = backImgId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getSpaceId() {
		return spaceId;
	}
	public void setSpaceId(int spaceId) {
		this.spaceId = spaceId;
	}
	public Date getSetTime() {
		return setTime;
	}
	public void setSetTime(Date setTime) {
		this.setTime = setTime;
	}
}
