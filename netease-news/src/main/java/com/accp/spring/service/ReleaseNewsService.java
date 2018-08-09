package com.accp.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.entity.Discuss;
import com.accp.spring.entity.NewsTable;
import com.accp.spring.mapper.ReleaseNewsMapper;

@Service
public class ReleaseNewsService {
	@Autowired
	private ReleaseNewsMapper rnm;
	
	//发布帖子
	public int Insertinvitation(NewsTable nt) {
		return this.rnm.Insertinvitation(nt);
	}
	//评论
	public int insertDiscuss(Discuss d) {
		return this.rnm.insertDiscuss(d);
	}
}
