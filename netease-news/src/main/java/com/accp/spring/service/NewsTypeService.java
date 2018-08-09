package com.accp.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.entity.NewsType;
import com.accp.spring.mapper.NewsTypeMapper;

@Service
public class NewsTypeService {
	@Autowired
	private NewsTypeMapper ntm;
	
	public List<NewsType> selectNewsType(){
		return this.ntm.selectNewsType();
	}
}
