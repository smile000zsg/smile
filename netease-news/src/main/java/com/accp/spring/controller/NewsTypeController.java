package com.accp.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.accp.spring.entity.NewsType;
import com.accp.spring.service.NewsTypeService;

@Controller
@RequestMapping("/api/newsType")
public class NewsTypeController {
	@Autowired
	private NewsTypeService nts;
	
	@ResponseBody
	@RequestMapping("/selectNewsType")
	public List<NewsType> selectNewsType(){
		return this.nts.selectNewsType();
	}
}
