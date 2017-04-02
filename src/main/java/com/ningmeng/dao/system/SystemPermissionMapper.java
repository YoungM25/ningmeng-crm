package com.ningmeng.dao.system;


import com.ningmeng.domain.system.SystemPermission;

import java.util.List;
import java.util.Map;

public interface SystemPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemPermission record);

    int insertSelective(SystemPermission record);

    SystemPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemPermission record);

    int updateByPrimaryKey(SystemPermission record);

    List<SystemPermission> getByMap(Map<String, Object> map);

    SystemPermission getById(Integer id);

    Integer create(SystemPermission permission);

    int update(SystemPermission permission);

    int delete(Integer id);

    List<SystemPermission> getList();

    List<SystemPermission> getByUserId(Long userId);
}