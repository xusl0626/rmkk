package com.rmkk.service;

import com.rmkk.entity.User;

public interface IUserService {

	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public User userLogin(User user);
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public User userRegister(User user);
}
