package com.lslg.hxmall.entity.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author Anyu
 * @since 2020/10/19
 */
public enum PayTypeEnum implements ICode{
    //
    WECHART(1,"微信");

    @EnumValue
    private int code;
    private String desc;

    PayTypeEnum(int code, String desc) {
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
