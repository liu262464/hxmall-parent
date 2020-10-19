package com.lslg.hxmall.entity.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author Anyu
 * @since 2020/10/19
 */
public enum GenderEnum implements ICode {
    //性别
    UNKNOWN(0, "未知"),
    MALE(1, "男"),
    FEMALE(2, "女");

    @EnumValue
    private int code;
    private String desc;

    GenderEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }
}
