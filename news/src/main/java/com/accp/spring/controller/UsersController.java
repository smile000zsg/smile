package com.accp.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.spring.entity.Users;
import com.accp.spring.service.UsersService;

@Controller
@RequestMapping("/api/user")
public class UsersController {
	@Autowired
	private UsersService us;
	
	@ResponseBody
	@RequestMapping("/insertrUsers")
	public int insertrUsers(Users u) {
		return this.us.insertUsers(u);
	}
	@ResponseBody
	@RequestMapping("/selectUsers")
	public Users selectUsers(String userName,String password) {
		return this.us.selectUsers(userName,password);
	}
}
