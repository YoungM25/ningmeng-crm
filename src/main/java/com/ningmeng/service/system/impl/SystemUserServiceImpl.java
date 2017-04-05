package com.ningmeng.service.system.impl;

import com.ningmeng.dao.system.SystemUserMapper;
import com.ningmeng.domain.system.SystemUser;
import com.ningmeng.service.system.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/30.
 */
@Service
public class SystemUserServiceImpl implements SystemUserService {

    @Autowired
    private SystemUserMapper systemUserMapper;
    @Override
    public SystemUser selectByUsername(String username) {
        return systemUserMapper.selectByUsername(username);
    }

    public List<SystemUser> getByMap(Map<String,Object> map) {
        return systemUserMapper.getByMap(map);
    }

    public SystemUser getById(Integer id) {
        return systemUserMapper.getById(id);
    }

    public SystemUser create(SystemUser user) {
        systemUserMapper.create(user);
        return user;
    }

    public SystemUser update(SystemUser user) {
        systemUserMapper.update(user);
        return user;
    }

    public int delete(Integer id) {
        return systemUserMapper.delete(id);
    }

    public SystemUser getByUserName(String userName) {
        return systemUserMapper.getByUserName(userName);
    }
}
