package com.ningmeng.dao.system;

import com.ningmeng.domain.system.SysPermission;
import com.ningmeng.domain.system.SystemPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);

    List<SystemPermission> getByUserId(@Param("userid") String id);

    List<SysPermission> findMenuListByUserId(@Param("userid")String id);
}