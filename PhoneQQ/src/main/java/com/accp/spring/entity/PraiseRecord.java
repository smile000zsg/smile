package com.accp.spring.entity;

import java.util.Date;

public class PraiseRecord {
	private int praiseId;
	private int stateId;
	private int userid;
	private Date praiseTime;
	public int getPraiseId() {
		return praiseId;
	}
	public void setPraiseId(int praiseId) {
		this.praiseId = praiseId;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Date getPraiseTime() {
		return praiseTime;
	}
	public void setPraiseTime(Date praiseTime) {
		this.praiseTime = praiseTime;
	}
	
}
