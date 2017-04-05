package com.ningmeng.controller;


import com.ningmeng.common.utils.ShiroUtils;
import com.ningmeng.domain.mvc.Result;
import com.ningmeng.domain.system.SystemUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @title Controller公共组件
 * @author young.M
 * @CreatDate: 2017/4/5
 */
public abstract class AbstractController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected SystemUser getUser() {
		return ShiroUtils.getUserEntity();
	}

	protected Long getUserId() {
		return getUser().getId();
	}

	public static Result success() {
		return success(null);
	}

	public static Result success(String messege) {
		Result result = new Result();
		result.setCode("0");
		result.setStatus(true);
		result.setMsg(messege);
		return result;
	}

	public static Result success(Object object) {
		Result result = new Result();
		result.setCode("0");
		result.setStatus(true);
		result.setMsg("成功");
		result.setData(object);
		return result;
	}

	public static Result success(Object object,String messege) {
		Result result = new Result();
		result.setCode("0");
		result.setStatus(true);
		result.setMsg(messege);
		result.setData(object);
		return result;
	}

	public static Result error(String msg) {
		Result result = new Result();
		result.setStatus(false);
		result.setCode("500");
		result.setMsg(msg);
		return result;
	}

	public static Result error() {
		Result result = new Result();
		result.setStatus(false);
		result.setCode("500");
		result.setMsg("操作失败");
		return result;
	}

	public static Result error(String code, String messege) {
		Result result = new Result();
		result.setStatus(false);
		result.setCode(code);
		result.setMsg(messege);
		return result;
	}

}
