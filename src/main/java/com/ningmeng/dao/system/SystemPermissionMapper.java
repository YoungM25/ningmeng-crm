package com.ningmeng.dao.system;


import com.ningmeng.domain.system.SystemPermission;

public interface SystemPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemPermission record);

    int insertSelective(SystemPermission record);

    SystemPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemPermission record);

    int updateByPrimaryKey(SystemPermission record);
}