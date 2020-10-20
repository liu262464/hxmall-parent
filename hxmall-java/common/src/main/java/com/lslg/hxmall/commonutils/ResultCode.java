package com.lslg.hxmall.commonutils;

/**
 * @Author Enzo
 * @Date 2020/7/9 17:07
 * @Version 1.0.0
 */
public enum  ResultCode {

    /**
     * 成功20000 失败20001
     */
    SUCCESS(20000),ERROR(20001);
    int code;
    ResultCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
