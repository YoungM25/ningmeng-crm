package com.ningmeng.dao.system;


import com.ningmeng.domain.system.SystemUserRole;

public interface SystemUserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemUserRole record);

    int insertSelective(SystemUserRole record);

    SystemUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemUserRole record);

    int updateByPrimaryKey(SystemUserRole record);
}