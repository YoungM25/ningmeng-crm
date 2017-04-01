package com.ningmeng.dao.system;


import com.ningmeng.domain.system.SystemRolePermission;

public interface SystemRolePermissionMapper {
    int insert(SystemRolePermission record);

    int insertSelective(SystemRolePermission record);
}