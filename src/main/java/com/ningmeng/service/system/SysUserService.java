package com.ningmeng.service.system;

import com.ningmeng.domain.system.SysUser;

import java.util.List;
import java.util.Map;

/**
 * Created by yhy
 * date : 2017/4/15
 */
public interface SysUserService {
    SysUser selectByUsername(String username);

    public List<SysUser> getByMap(Map<String,Object> map);

    public SysUser getById(Integer id) ;

    public SysUser create(SysUser user);

    public SysUser update(SysUser user);

    public int delete(Integer id);

    public SysUser getByUserName(String userName);
}
