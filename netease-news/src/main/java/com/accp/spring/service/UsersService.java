package com.accp.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.entity.Users;
import com.accp.spring.mapper.UsersMapper;

@Service
public class UsersService {
	@Autowired
	private UsersMapper um;
	
	public int insertUsers(Users u) {
		return this.um.insertUsers(u);
	}
	public Users selectUsers(String userName,String password) {
		return this.um.selectUsers(userName,password);
	}
}
