package com.accp.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.spring.entity.Discuss;
import com.accp.spring.entity.NewsTable;
import com.accp.spring.entity.Reply;
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
	@ResponseBody
	@RequestMapping("/selectContent")
	public NewsTable selectContent(int newsId){
		return this.nts.selectContent(newsId);
	}
	//新闻信息查询
	@ResponseBody
	@RequestMapping("/selectInfo")
	public NewsTable selectInfo(int newsId) {
		return this.nts.selectInfo(newsId);
	}
	//分享
	@RequestMapping("/share/{newsId}")
	public String share(@PathVariable int newsId,Model model) {
		NewsTable nt =  this.nts.selectInfo(newsId);
		List<Discuss> ls = this.nts.listReply(newsId);
		model.addAttribute("nt", nt);
		model.addAttribute("ls", ls);
		return "/share/news.jsp";
	}
	//评论查询
	@ResponseBody
	@RequestMapping("/selectDiscuss")
	public List<Discuss> selectDiscuss(int newsId){
		return this.nts.selectDiscuss(newsId);
	}
	//回复查询
	@ResponseBody
	@RequestMapping("/selectReply")
	public List<Reply> selectReply(int newsId){
		return this.nts.selectReply(newsId);
	}
	@ResponseBody
	@RequestMapping("/listReply")
	public List<Discuss> listReply(int newsId){
		return this.nts.listReply(newsId);
	}
}
