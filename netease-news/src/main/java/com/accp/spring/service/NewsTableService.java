package com.accp.spring.service;

import java.util.List;

import org.apache.ibatis.javassist.compiler.SyntaxError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.entity.Discuss;
import com.accp.spring.entity.NewsTable;
import com.accp.spring.entity.Reply;
import com.accp.spring.mapper.NewsTableMapper;

@Service
public class NewsTableService {
	@Autowired
	private NewsTableMapper ntm;
	//新闻查询
	public List<NewsTable> selectNews(int newsTypeId){
		return this.ntm.selectNews(newsTypeId);
	}	
	public NewsTable selectContent(int newsId){
		return this.ntm.selectContent(newsId);
	}
	//新闻信息查询
	public NewsTable selectInfo(int newsId) {
		return this.ntm.selectInfo(newsId);
	}
	//评论查询
	public List<Discuss> selectDiscuss(int newsId){
		return this.ntm.selectDiscuss(newsId);
	}
	//回复查询
	public List<Reply> selectReply(int newsId){
		return this.ntm.selectReply(newsId);
	}
	//Discuss
	public List<Discuss> listReply(int newsId){
		List<Discuss> listDiscuss = this.ntm.selectDiscuss(newsId);
		for(int i=0;i<listDiscuss.size();i++) {
			int discussId = listDiscuss.get(i).getDiscussId();
			 List<Reply> listReply =this.ntm.selectReply(discussId);
			 listDiscuss.get(i).setListReply(listReply);
			 System.err.println(listDiscuss+"集成数据----------");
		}
		return listDiscuss;
	}
}
