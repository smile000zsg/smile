package com.accp.spring.entity;

public class NewsType {
	private int newsTypeId;
	private String newstitle;
	public int getNewsTypeId() {
		return newsTypeId;
	}
	public void setNewsTypeId(int newsTypeId) {
		this.newsTypeId = newsTypeId;
	}
	public String getNewstitle() {
		return newstitle;
	}
	public void setNewstitle(String newstitle) {
		this.newstitle = newstitle;
	}
	@Override
	public String toString() {
		return "NewsType [newsTypeId=" + newsTypeId + ", newstitle=" + newstitle + "]";
	}
	
}
