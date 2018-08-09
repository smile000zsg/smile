package com.accp.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.spring.entity.NewsTable;
import com.accp.spring.service.NewsTableService;

@Controller
@RequestMapping("/api")
public class NewsTableController {
	@Autowired
	private NewsTableService nts;
	
	@ResponseBody
	@RequestMapping("/selectNews")
	public List<NewsTable> selectNews(int newsTypeId){
		return this.nts.selectNews(newsTypeId);
	}
}
