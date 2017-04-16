package com.ningmeng.service.system;

import com.ningmeng.domain.system.SysPermission;
import com.ningmeng.domain.system.SystemPermission;

import java.util.List;

/**
 * Created by yhy
 * date : 2017/4/16
 */
public interface SysPermissionService {
    List<SystemPermission> getByUserId(String id);

    List<SysPermission> findMenuListByUserId(String id);
}
