package com.rmkk.dao;

import com.rmkk.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    User selectByCode(String code);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}