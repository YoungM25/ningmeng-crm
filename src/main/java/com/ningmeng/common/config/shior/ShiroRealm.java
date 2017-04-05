package com.ningmeng.common.config.shior;

import com.ningmeng.domain.system.SystemPermission;
import com.ningmeng.domain.system.SystemRole;
import com.ningmeng.domain.system.SystemUser;
import com.ningmeng.service.system.SystemPermissionService;
import com.ningmeng.service.system.SystemUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yhy on 2017/4/1.
 */
public class ShiroRealm extends AuthorizingRealm {

    private final static Logger logger = LoggerFactory.getLogger(ShiroRealm.class);


    @Autowired
    private SystemUserService systemUserService;
    @Autowired
    private SystemPermissionService systemPermissionService;
    /**
     * 此方法调用  hasRole,hasPermission的时候才会进行回调.
     *
     * 权限信息.(授权):
     * 1、如果用户正常退出，缓存自动清空；
     * 2、如果用户非正常退出，缓存自动清空；
     * 3、如果我们修改了用户的权限，而用户不退出系统，修改的权限无法立即生效。
     * （需要手动编程进行实现；放在service进行调用）
     * 在权限修改后调用realm中的方法，realm已经由spring管理，所以从spring中获取realm实例，
     * 调用clearCached方法；
     * :Authorization 是授权访问控制，用于对用户进行的操作授权，证明该用户是否允许进行当前操作，如访问某个链接，某个资源文件等。
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.info("doGetAuthorizationInfo+"+principals.toString());
        SystemUser user = (SystemUser)principals.getPrimaryPrincipal();
//        SystemUser user = systemUserService.selectByUsername((String) principalCollection.getPrimaryPrincipal());
        Long id = user.getId();

        //把principals放session中 key=userId value=principals
        SecurityUtils.getSubject().getSession().setAttribute(String.valueOf(id),SecurityUtils.getSubject().getPrincipals());

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //赋予角色
        for(SystemRole userRole : user.getRoles()){
            info.addRole(userRole.getRoleName());
        }
        //赋予权限
        for(SystemPermission permission:systemPermissionService.getByUserId(id)){
//            if(StringUtils.isNotBlank(permission.getPermCode()))
            info.addStringPermission(permission.getName());
        }

        //设置登录次数、时间
//        userService.updateUserLogin(user);
        return info;
    }

    /**
     * 认证信息.(身份验证)
     * :
     * Authentication 是用来验证用户身份
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        logger.info("doGetAuthenticationInfo +"  + token.toString());

//        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
//        String userName=token.getUsername();

        String username = (String) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());
        logger.info(username+password);

        //查询用户信息
        SystemUser user = systemUserService.selectByUsername(username);

        //账号不存在
        if(user == null) {
            throw new UnknownAccountException("账号或密码不正确");
        }

        //密码错误
        if(!password.equals(user.getPassword())) {
            throw new IncorrectCredentialsException("账号或密码不正确");
        }

        //账号锁定
        if(user.getStatus() == 0){
            throw new LockedAccountException("账号已被锁定,请联系管理员");
        }

//            byte[] salt = Encodes.decodeHex(user.getSalt());
//            ShiroUser shiroUser=new ShiroUser(user.getId(), user.getLoginName(), user.getName());
        //设置用户session
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("user", user);
        return new SimpleAuthenticationInfo(username,user.getPassword(),getName());

    }
}

