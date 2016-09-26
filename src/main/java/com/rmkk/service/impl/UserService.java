package com.rmkk.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rmkk.dao.UserMapper;
import com.rmkk.entity.User;
import com.rmkk.service.IUserService;
@Service
public class UserService implements IUserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public User userLogin(User user) {
		User loginUser=userMapper.selectByCode(user.getCode());
		return loginUser;
	}

	/**
	 * 用户注册
	 * 根据给定用户
	 */
	@Override
	public User userRegister(User user) {
		User loginUser=userMapper.selectByCode(user.getCode());
		if(loginUser!=null){
			userMapper.insertSelective(user);
			return user;
		}
		return null;
	}

}
