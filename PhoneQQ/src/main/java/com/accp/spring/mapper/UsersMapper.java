package com.accp.spring.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.accp.spring.entity.Users;

public interface UsersMapper { 
	//@Select("select * from Users where userName=#{userName} and password=#{password}")
	Users selectUsers(String userName,String password);
	
	//@Insert("insert into Users(userName,password,nickName,createTime,headImg)VALUES(#{userName},"
		//	+ "#{password},#{nickName},NOW(),#{headImg})")
	int insertUsers(Users u);
}