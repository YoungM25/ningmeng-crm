package com.ningmeng.service.system;

import com.ningmeng.domain.system.SystemPermission;

import java.util.List;
import java.util.Map;

/**
 * Created by yhy on 2017/4/2.
 */
public interface SystemPermissionService {
    List<SystemPermission> getByMap(Map<String,Object> map);

    SystemPermission getById(Integer id);

    SystemPermission create(SystemPermission permission);

    SystemPermission update(SystemPermission permission);

    int delete(Integer id);

    List<SystemPermission> getByUserId(Long id);
}
