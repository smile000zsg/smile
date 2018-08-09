package com.accp.spring.entity;

public class Img {
	private int imgId;
	private String newsImg;
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
		return "Img [imgId=" + imgId + ", newsImg=" + newsImg + "]";
	}
}
