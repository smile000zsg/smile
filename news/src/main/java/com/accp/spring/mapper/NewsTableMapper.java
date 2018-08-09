package com.accp.spring.mapper;

import java.util.List;

import com.accp.spring.entity.NewsTable;

public interface NewsTableMapper {
	//查询新闻
	List<NewsTable> selectNews(int newsTypeId);
}
