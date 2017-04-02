package com.ningmeng.controller.system;

import com.ningmeng.domain.system.SystemUser;
import com.ningmeng.service.system.SystemUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class SystemUserController {
	private final static Logger logger = LoggerFactory.getLogger(SystemUserController.class);
	@Autowired
	private SystemUserService systemUserService;

	@RequestMapping(value="/index",method=RequestMethod.GET)

	public String addToReadList(){

		return "admin/index";
	}
	@RequestMapping(value="/user",method=RequestMethod.GET)
	@ResponseBody
	public String getUser(){
		SystemUser systemUser = systemUserService.selectByUsername("admin");
		return systemUser.toString();
	}
}
