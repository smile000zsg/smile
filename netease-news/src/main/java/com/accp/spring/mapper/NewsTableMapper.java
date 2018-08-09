package com.accp.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.spring.entity.Discuss;
import com.accp.spring.entity.NewsTable;
import com.accp.spring.entity.Reply;

public interface NewsTableMapper {
	//查询新闻
	List<NewsTable> selectNews(int newsTypeId);
	//新闻内容
	NewsTable selectContent(@Param("newsId")int newsId);
	//详细新闻
	NewsTable selectInfo(@Param("newsId")int newsId);
	//查询评论
	List<Discuss> selectDiscuss(@Param("newsId")int newsId);
	//查询回复
	List<Reply> selectReply(@Param("discussId")int discussId);
	//listReply
}
