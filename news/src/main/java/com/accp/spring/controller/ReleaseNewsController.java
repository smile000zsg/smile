package com.accp.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.spring.entity.NewsTable;
import com.accp.spring.service.ReleaseNewsService;

@Controller
@RequestMapping("/api/releaseNews")
public class ReleaseNewsController {
	@Autowired
	private ReleaseNewsService res;
	
	//发布帖子
	@ResponseBody
	@RequestMapping("/Insertinvitation")
	public int Insertinvitation(NewsTable nt) {
		return this.res.Insertinvitation(nt);
	}
}
