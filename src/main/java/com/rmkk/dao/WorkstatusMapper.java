package com.rmkk.dao;

import com.rmkk.entity.Workstatus;

public interface WorkstatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Workstatus record);

    int insertSelective(Workstatus record);

    Workstatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Workstatus record);

    int updateByPrimaryKey(Workstatus record);
}