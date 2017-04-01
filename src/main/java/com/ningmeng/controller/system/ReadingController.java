package com.ningmeng.controller.system;

import com.ningmeng.domain.system.SystemUser;
import com.ningmeng.service.system.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ReadingController {
	@Autowired
	private SystemUserService systemUserService;

	@RequestMapping(value="/index",method=RequestMethod.GET)

	public String addToReadList(){

		return "admin/index";
	}
	@RequestMapping(value="/user",method=RequestMethod.GET)
	@ResponseBody
	public String getUser(){
		SystemUser systemUser = systemUserService.get(1l);
		return systemUser.toString();
	}
}
