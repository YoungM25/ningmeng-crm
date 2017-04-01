package com.ningmeng.dao.system;


import com.ningmeng.domain.system.SystemRoleMenu;

public interface SystemRoleMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemRoleMenu record);

    int insertSelective(SystemRoleMenu record);

    SystemRoleMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemRoleMenu record);

    int updateByPrimaryKey(SystemRoleMenu record);
}