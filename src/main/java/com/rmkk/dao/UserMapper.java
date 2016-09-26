package com.rmkk.dao;

import com.rmkk.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    /**
     * 根据员工编号查找
     * @param code
     * @return
     */
    User selectByCode(String code);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}