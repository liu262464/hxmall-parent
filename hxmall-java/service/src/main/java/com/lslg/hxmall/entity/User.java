package com.lslg.hxmall.entity;


import com.baomidou.mybatisplus.annotation.*;
import com.lslg.hxmall.entity.enums.GenderEnum;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * (User)实体类
 *
 * @author Anyu
 * @since 2020-10-19 18:02:22
 */
@TableName(value = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 672990308600098053L;
    /**
     * 用户ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 账号
     */
    private String account;
    /**
     * 用户名
     */
    private String username;
    /**
     * 0-未知，1-男，2-女
     */
    private GenderEnum gender;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 密码
     */
    private String password;
    /**
     * 地址
     */
    private String address;

    @TableLogic
    private Integer status;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createtime;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime modifiedtime;


}