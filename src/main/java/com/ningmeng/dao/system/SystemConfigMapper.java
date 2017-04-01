package com.ningmeng.dao.system;


import com.ningmeng.domain.system.SystemConfig;

public interface SystemConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemConfig record);

    int insertSelective(SystemConfig record);

    SystemConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemConfig record);

    int updateByPrimaryKey(SystemConfig record);
}