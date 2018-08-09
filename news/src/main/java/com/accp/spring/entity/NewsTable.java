package com.accp.spring.entity;

import java.util.Date;

public class NewsTable {
	private int newsId;
	private String newsTheme;
	private String newsContent;
	private Date releaseTime;
	private int userId;
	private int newsTypeId;
	private int newsImgId;
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getNewsTheme() {
		return newsTheme;
	}
	public void setNewsTheme(String newsTheme) {
		this.newsTheme = newsTheme;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getNewsTypeId() {
		return newsTypeId;
	}
	public void setNewsTypeId(int newsTypeId) {
		this.newsTypeId = newsTypeId;
	}
	public int getNewsImgId() {
		return newsImgId;
	}
	public void setNewsImgId(int newsImgId) {
		this.newsImgId = newsImgId;
	}
	@Override
	public String toString() {
		return "NewsTable [newsId=" + newsId + ", newsTheme=" + newsTheme + ", newsContent=" + newsContent
				+ ", releaseTime=" + releaseTime + ", userId=" + userId + ", newsTypeId=" + newsTypeId + ", newsImgId="
				+ newsImgId + "]";
	}
}
