package com.ningmeng.service.system.impl;

import com.ningmeng.dao.system.SysUserMapper;
import com.ningmeng.domain.system.SysUser;
import com.ningmeng.service.system.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by yhy
 * date : 2017/4/15
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUser selectByUsername(String username) {
        return sysUserMapper.selectByUsername(username);
    }

    public List<SysUser> getByMap(Map<String,Object> map) {
        return sysUserMapper.getByMap(map);
    }

    public SysUser getById(Integer id) {
        return sysUserMapper.getById(id);
    }

    public SysUser create(SysUser user) {
        sysUserMapper.create(user);
        return user;
    }

    public SysUser update(SysUser user) {
        sysUserMapper.update(user);
        return user;
    }

    public int delete(Integer id) {
        return sysUserMapper.delete(id);
    }

    public SysUser getByUserName(String userName) {
        return sysUserMapper.getByUserName(userName);
    }

}
