package com.ningmeng.dao.system;

import com.ningmeng.dao.BaseDao;
import com.ningmeng.domain.system.SystemUser;

/**
 * 系统用户
 * 
 *
 */
public interface SystemUserDao extends BaseDao<SystemUser> {
//    @Select("select * from nm_system_user where id=1")
    SystemUser queryUserById(Long id);

}
