package com.ningmeng.service.system.impl;

import com.ningmeng.dao.system.SysPermissionMapper;
import com.ningmeng.domain.system.SysPermission;
import com.ningmeng.domain.system.SystemPermission;
import com.ningmeng.service.system.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yhy
 * date : 2017/4/16
 */
@Service
public class SysPermissionServiceImpl implements SysPermissionService {
    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    /**
     * 根据用户ID查询用户的权限列表；
     * @param id
     * @return
     */
    @Override
    public List<SystemPermission> getByUserId(String id) {
        return sysPermissionMapper.getByUserId(id);
    }

    @Override
    public List<SysPermission> findMenuListByUserId(String id) {
        return sysPermissionMapper.findMenuListByUserId(id);
    }

	@Override
	public List<SysPermission> getRootMenuByUser(String id) {
		// TODO Auto-generated method stub
		return sysPermissionMapper.getRootMenuByUser(id);
	}

	@Override
	public List<SysPermission> getChildMenuByUser(String id) {
		// TODO Auto-generated method stub
		return sysPermissionMapper.getChildMenuByUser(id);
	}
}
