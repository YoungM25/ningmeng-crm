package com.ningmeng.controller.system;

import com.ningmeng.controller.AbstractController;
import com.ningmeng.domain.system.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @title   首页
 * @author young.M
 * @CreatDate: 2017/4/5
 */
@Controller
public class IndexController extends AbstractController{

    @RequestMapping(value="/index",method= RequestMethod.GET)
    public String index(Model model){

        //从shiro的session中取出activeUser
        Subject subject= SecurityUtils.getSubject();
        //取出身份信息
        SysUser activeUser= (SysUser) subject.getPrincipal();
        //通过model传到页面
        model.addAttribute("activeUser",activeUser);

        return "admin/index";
    }
    @RequestMapping(value="/signin",method= RequestMethod.GET)
    public String signin(){

        return "sign/signin";
    }

}
