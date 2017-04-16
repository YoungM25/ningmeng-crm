package com.ningmeng.dao.system;

import com.ningmeng.domain.system.SysUser;

import java.util.List;
import java.util.Map;

public interface SysUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    SysUser selectByUsername(String username);
    List<SysUser> getByMap(Map<String, Object> map);
    SysUser getById(Integer id);
    Integer create(SysUser user);
    int update(SysUser user);
    int delete(Integer id);
    SysUser getByUserName(String userName);
}