package com.accp.spring.mapper;

import com.accp.spring.entity.Discuss;
import com.accp.spring.entity.NewsTable;

public interface ReleaseNewsMapper {
	//发布帖子
	int Insertinvitation(NewsTable nt);
	//评论
	int insertDiscuss(Discuss d);
}
