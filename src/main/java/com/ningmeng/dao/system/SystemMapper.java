package com.ningmeng.dao.system;

public interface SystemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(System record);

    int insertSelective(System record);

    System selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(System record);

    int updateByPrimaryKey(System record);
}