package com.rmkk.dao;

import com.rmkk.entity.Work;

public interface WorkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Work record);

    int insertSelective(Work record);

    Work selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Work record);

    int updateByPrimaryKeyWithBLOBs(Work record);

    int updateByPrimaryKey(Work record);
}