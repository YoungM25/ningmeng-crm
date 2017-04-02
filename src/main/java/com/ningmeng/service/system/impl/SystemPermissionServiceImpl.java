package com.ningmeng.service.system.impl;

import com.ningmeng.dao.system.SystemPermissionMapper;
import com.ningmeng.domain.system.SystemPermission;
import com.ningmeng.service.system.SystemPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by yhy on 2017/4/2.
 */
@Service
public class SystemPermissionServiceImpl implements SystemPermissionService {

    @Autowired
    private SystemPermissionMapper permissionDao;

    public List<SystemPermission> getByMap(Map<String,Object> map) {
        return permissionDao.getByMap(map);
    }

    public SystemPermission getById(Integer id) {
        return permissionDao.getById(id);
    }

    public SystemPermission create(SystemPermission permission) {
        permissionDao.create(permission);
        return permission;
    }

    public SystemPermission update(SystemPermission permission) {
        permissionDao.update(permission);
        return permission;
    }

    public int delete(Integer id) {
        return permissionDao.delete(id);
    }


    public List<SystemPermission> getByUserId(Long id) {
        return permissionDao.getByUserId(id);
    }
}
