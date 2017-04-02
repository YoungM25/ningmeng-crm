package com.ningmeng.service.system.impl;


import com.ningmeng.dao.system.SystemRoleMapper;
import com.ningmeng.domain.system.SystemRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SystemRoleServiceImpl {
    @Autowired
	private SystemRoleMapper roleDao;
	
	public List<SystemRole> getByMap(Map<String,Object> map) {
	    return roleDao.getByMap(map);
	}
	
	public SystemRole getById(Integer id) {
		return roleDao.getById(id);
	}
	
	public SystemRole create(SystemRole role) {
		roleDao.create(role);
		return role;
	}
	
	public SystemRole update(SystemRole role) {
		roleDao.update(role);
		return role;
	}
	
	public int delete(Integer id) {
		return roleDao.delete(id);
	}
    
}