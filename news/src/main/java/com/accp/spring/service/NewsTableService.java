package com.accp.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.entity.NewsTable;
import com.accp.spring.mapper.NewsTableMapper;

@Service
public class NewsTableService {
	@Autowired
	private NewsTableMapper ntm;
	//新闻查询
	public List<NewsTable> selectNews(int newsTypeId){
		return this.ntm.selectNews(newsTypeId);
	}
}
