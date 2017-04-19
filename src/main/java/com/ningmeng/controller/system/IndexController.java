package com.ningmeng.controller.system;


import com.ningmeng.common.utils.TreeNode;
import com.ningmeng.common.utils.TreeUtil;
import com.ningmeng.controller.AbstractController;
import com.ningmeng.domain.system.SysPermission;
import com.ningmeng.domain.system.SysUser;
import com.ningmeng.service.system.SysPermissionService;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private SysPermissionService sysPermissionService;
    @RequestMapping(value="/",method= RequestMethod.GET)
    public String index(Model model){

        //从shiro的session中取出activeUser
        Subject subject= SecurityUtils.getSubject();
        //取出身份信息
        SysUser user= (SysUser) subject.getPrincipal();
        //通过model传到页面
        List<SysPermission> rootMenus = null;
		List<SysPermission> childMenus = null;
		rootMenus = sysPermissionService.getRootMenuByUser(user.getId() );//根节点
		childMenus = sysPermissionService.getChildMenuByUser(user.getId());//子节点
		List<TreeNode> treeMenu = treeMenu(rootMenus,childMenus);
		model.addAttribute("activeUser",user);
		model.addAttribute("menuList", treeMenu);
        return "admin/index";
    }
    
    /**
	 * 构建树形数据
	 * @return
	 */
	private List<TreeNode> treeMenu(List<SysPermission> rootMenus,List<SysPermission> childMenus){
		TreeUtil util = new TreeUtil(rootMenus,childMenus);
		return util.getTreeNode();
	}
	
	
    @RequestMapping(value="/signin",method= RequestMethod.GET)
    public String signin(){

        return "sign/signin";
    }

}
