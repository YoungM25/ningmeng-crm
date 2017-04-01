package com.ningmeng.common.utils;

import com.ningmeng.domain.mvc.Result;

/**
 * Created by yhy on 2017/4/1.
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode("0");
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(String code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
