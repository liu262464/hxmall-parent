package com.lslg.hxmall.entity.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * 支付状态
 *
 * @author Anyu
 * @since 2020/10/19
 */
public enum PayStateEnum implements ICode {
    //0-未支付，1-已支付
    UNPAID(0, "未支付"),
    PAID(1, "已支付");

    @EnumValue
    private int code;
    private String desc;

    PayStateEnum(int code, String desc) {
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
