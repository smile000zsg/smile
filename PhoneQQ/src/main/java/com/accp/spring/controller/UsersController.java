package com.accp.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.accp.spring.entity.Users;
import com.accp.spring.service.UsersService;

@Controller
@RequestMapping("/user")
public class UsersController {
	
	@Autowired
	private UsersService us;
	
	@RequestMapping(value="/selectUsers",method=RequestMethod.POST)
	public String selectUsers(String userName,String password,HttpSession session) {
		Users u = this.us.selectUsers(userName, password);
		session.setAttribute("userId",u.getUserId());
		if(u==null) {
			return "redirect:/QQ/login.jsp";
		}
		return "redirect:/QQ/index.jsp";
	}
}
