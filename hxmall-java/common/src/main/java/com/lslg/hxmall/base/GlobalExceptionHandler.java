package com.lslg.hxmall.base;

import com.lslg.hxmall.commonutils.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Enzo
 * @Date 2020/10/20 8:59
 * @Version 1.0.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 统一异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
        e.printStackTrace();
        return R.not_ok().message("请求处理出了点问题...");
    }

    /**
     * 特殊/指定异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public R error(ArithmeticException e){
        e.printStackTrace();
        return R.not_ok().message("ArithmeticException异常");
    }

    /**
     * 自定义异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(HxException.class)
    @ResponseBody
    public R error(HxException e){
        e.printStackTrace();
        return R.not_ok().message(e.getMsg()).code(e.getCode());
    }
}
