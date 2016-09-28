package com.rmkk.controller;

import java.util.Date;

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
	
	@RequestMapping(value="login")
	public String login(){
		return "index";
	}
	
	@RequestMapping(value="exit")
	public String exit(HttpServletRequest request){
		request.getSession().removeAttribute("oper");
		return "redirect:/index";
	}
	
	@ResponseBody
	@RequestMapping(value="/tologin",method=RequestMethod.POST)
	public String tologin(HttpServletRequest request){
		User user=new User();
		user.setCode(request.getParameter("user.code"));
		user.setPassword(request.getParameter("user.password"));
		System.out.println(user);
		Webobj wo=new Webobj();
		User loger=userService.userLogin(user);
		if(loger!=null){
			request.getSession().setAttribute("oper", loger);
		}
		String result=JSON.toJSONString(loger);
		System.out.println(result);
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value="/toregister",method=RequestMethod.POST)
	public String toregister(HttpServletRequest request){
		User user=new User();
		user.setName(request.getParameter("name"));
		user.setCode(request.getParameter("code"));
		user.setPassword(request.getParameter("pwd"));
		user.setRoleId(1);
		user.setCerateDate(new Date());
		User returnUser=userService.userRegister(user);
		if(returnUser!=null){
			request.getSession().setAttribute("oper", returnUser);
		}
		return JSON.toJSONString(returnUser);
	}
}
