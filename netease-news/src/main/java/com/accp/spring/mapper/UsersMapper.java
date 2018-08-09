package com.accp.spring.mapper;

import org.apache.ibatis.annotations.Param;

import com.accp.spring.entity.Users;

public interface UsersMapper {
	int insertUsers(Users u);
	Users selectUsers(@Param("userName")String userName,@Param("password")String password);
}
