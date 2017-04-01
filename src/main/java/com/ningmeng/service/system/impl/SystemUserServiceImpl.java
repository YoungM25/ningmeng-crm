package com.ningmeng.service.system.impl;

import com.ningmeng.dao.system.SystemUserDao;
import com.ningmeng.domain.system.SystemUser;
import com.ningmeng.service.system.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/30.
 */
@Service("systemUserService")
public class SystemUserServiceImpl implements SystemUserService {
    @Autowired
    private SystemUserDao systemUserDao;
    @Override
    public SystemUser get(Long id) {
        return systemUserDao.queryUserById(id);
    }
}
