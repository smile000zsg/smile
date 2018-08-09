package com.accp.spring.entity;

public class Img {
	private int imgId;
	private String newsImg;
	private int newsId;
	
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public int getImgId() {
		return imgId;
	}
	public void setImgId(int imgId) {
		this.imgId = imgId;
	}
	public String getNewsImg() {
		return newsImg;
	}
	public void setNewsImg(String newsImg) {
		this.newsImg = newsImg;
	}
	@Override
	public String toString() {
		return "Img [imgId=" + imgId + ", newsImg=" + newsImg + ", newsId=" + newsId + "]";
	}
}
