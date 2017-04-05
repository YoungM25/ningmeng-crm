package com.ningmeng.controller.system;

import com.ningmeng.controller.AbstractController;
import com.ningmeng.service.system.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SystemUserController extends AbstractController{
	@Autowired
	private SystemUserService systemUserService;




}
