package com.ningmeng.service.system;

import com.ningmeng.domain.system.SystemUser;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/30.
 */
public interface SystemUserService {
    SystemUser selectByUsername(String username);

    public List<SystemUser> getByMap(Map<String,Object> map);

    public SystemUser getById(Integer id) ;

    public SystemUser create(SystemUser user);

    public SystemUser update(SystemUser user);

    public int delete(Integer id);

    public SystemUser getByUserName(String userName);
}
