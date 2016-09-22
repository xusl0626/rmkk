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
	public int userLogin(User user) {
		// TODO Auto-generated method stub
		User loginUser=userMapper.selectByCode(user.getCode());
		int loginCount=0;
		if(loginUser==null){
			loginCount=userMapper.insertSelective(user);
		}
		return loginCount;
	}

}
