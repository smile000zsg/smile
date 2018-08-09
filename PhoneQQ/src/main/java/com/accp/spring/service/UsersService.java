package com.accp.spring.service;

import org.springframework.stereotype.Service;

import com.accp.spring.entity.Users;
import com.accp.spring.mapper.UsersMapper;

@Service
public class UsersService {
	private UsersMapper um;
	public Users selectUsers(String userName,String password) {
		return this.um.selectUsers(userName,password);
	}
}
