package com.ningmeng.dao.system;


import com.ningmeng.domain.system.SystemRole;

import java.util.List;
import java.util.Map;

public interface SystemRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemRole record);

    int insertSelective(SystemRole record);

    SystemRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemRole record);

    int updateByPrimaryKey(SystemRole record);

    List<SystemRole> getByMap(Map<String, Object> map);
    SystemRole getById(Integer id);
    Integer create(SystemRole role);
    int update(SystemRole role);
    int delete(Integer id);
}