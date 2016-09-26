package com.rmkk.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.rmkk.entity.User;
import com.rmkk.service.IUserService;
import com.rmkk.util.Webobj;
@Controller
public class UserController {

	@Resource
	private IUserService userService;
	
	@RequestMapping(value={"/","index"},method=RequestMethod.GET)
	public String index(){
		return "login";
	}
	
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(HttpServletRequest request){
		User user=new User();
		user.setCode(request.getParameter("user.code"));
		user.setPassword(request.getParameter("user.password"));
		System.out.println(user);
		Webobj wo=new Webobj();
		User loger=userService.userLogin(user);
		/*if(recode==1){
			wo.setStatus("200");
			wo.setMsg("登录成功");
		}*/
		return JSON.toJSONString(loger);
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(HttpServletRequest request){
		User user=new User();
		user.setName(request.getParameter("name"));
		user.setCode(request.getParameter("code"));
		user.setPassword(request.getParameter("pwd"));
		return JSON.toJSONString(userService.userRegister(user));
	}
}
