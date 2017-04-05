package com.ningmeng.controller.system;

import com.ningmeng.common.utils.ShiroUtils;
import com.ningmeng.controller.AbstractController;
import com.ningmeng.domain.mvc.Result;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yhy on 2017/4/2.
 */
@RestController
public class LoginController extends AbstractController{
    /**
     *  登录
     * @param userName
     * @param password
     * @param rememberMe
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(
            @RequestParam(value = "username", required = true) String userName,
            @RequestParam(value = "password", required = true) String password,
            @RequestParam(value = "rememberMe", required = true, defaultValue = "false") boolean rememberMe
    ) {
        logger.info("==========" + userName + password + rememberMe);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        token.setRememberMe(rememberMe);
        try {
            subject.login(token);
        }catch (UnknownAccountException e) {
            return error(e.getMessage());
        }catch (IncorrectCredentialsException e) {
            return error(e.getMessage());
        }catch (LockedAccountException e) {
            return error(e.getMessage());
        }catch (AuthenticationException e) {
            return error("账户验证失败");
        }
        return success("登陆成功！");
    }

    /**
     * 退出
     */
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout() {
        ShiroUtils.logout();
        return "redirect:/signin";
    }
}
