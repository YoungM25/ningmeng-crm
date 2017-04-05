package com.ningmeng.controller.system;

import com.ningmeng.controller.AbstractController;
import org.springframework.stereotype.Controller;
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
    public String addToReadList(){

        return "admin/index";
    }
}
