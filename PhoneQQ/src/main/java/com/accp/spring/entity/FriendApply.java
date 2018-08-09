package com.accp.spring.entity;

import java.util.Date;

public class FriendApply {
	private int applyId;
	private String remark;
	private int applyuserId;
	private int pasvuserId;
	private int isOk;
	private Date applyTime;
	
	public int getApplyId() {
		return applyId;
	}
	public void setApplyId(int applyId) {
		this.applyId = applyId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getApplyuserId() {
		return applyuserId;
	}
	public void setApplyuserId(int applyuserId) {
		this.applyuserId = applyuserId;
	}
	public int getPasvuserId() {
		return pasvuserId;
	}
	public void setPasvuserId(int pasvuserId) {
		this.pasvuserId = pasvuserId;
	}
	public int getIsOk() {
		return isOk;
	}
	public void setIsOk(int isOk) {
		this.isOk = isOk;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
}
