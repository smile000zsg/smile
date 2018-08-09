package com.accp.spring.mapper;

import com.accp.spring.entity.Users;

public interface UsersMapper {
	int insertUsers(Users u);
	
	Users selectUsers(String userName,String password);
}
