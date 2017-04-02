package com.ningmeng.service.system;


import com.ningmeng.domain.system.SystemRole;

import java.util.List;
import java.util.Map;

public interface SystemRoleService {
	 List<SystemRole> getByMap(Map<String,Object> map);
	
	 SystemRole getById(Integer id);
	
	 SystemRole create(SystemRole role) ;
	
	 SystemRole update(SystemRole role);
	
	 int delete(Integer id);
    
}