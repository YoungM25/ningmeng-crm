package com.ningmeng.dao.system;


import com.ningmeng.domain.system.SystemRole;

public interface SystemRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemRole record);

    int insertSelective(SystemRole record);

    SystemRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemRole record);

    int updateByPrimaryKey(SystemRole record);
}