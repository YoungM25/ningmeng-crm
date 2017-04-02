package com.ningmeng.service.system.impl;

import com.ningmeng.dao.system.SystemUserDao;
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
    private SystemUserDao systemUserDao;
    @Override
    public SystemUser selectByUsername(String username) {
        return systemUserDao.selectByUsername(username);
    }

    public List<SystemUser> getByMap(Map<String,Object> map) {
        return systemUserDao.getByMap(map);
    }

    public SystemUser getById(Integer id) {
        return systemUserDao.getById(id);
    }

    public SystemUser create(SystemUser user) {
        systemUserDao.create(user);
        return user;
    }

    public SystemUser update(SystemUser user) {
        systemUserDao.update(user);
        return user;
    }

    public int delete(Integer id) {
        return systemUserDao.delete(id);
    }

    public SystemUser getByUserName(String userName) {
        return systemUserDao.getByUserName(userName);
    }
}
