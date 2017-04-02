package com.ningmeng.dao.system;


import com.ningmeng.domain.system.SystemUser;

import java.util.List;
import java.util.Map;


public interface SystemUserDao {
    int deleteByPrimaryKey(Long id);

    int insert(SystemUser record);

    int insertSelective(SystemUser record);

    SystemUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemUser record);

    int updateByPrimaryKey(SystemUser record);

    SystemUser selectByUsername(String username);

    List<SystemUser> getByMap(Map<String, Object> map);
    SystemUser getById(Integer id);
    Integer create(SystemUser user);
    int update(SystemUser user);
    int delete(Integer id);
    SystemUser getByUserName(String userName);
}