package com.lslg.hxmall.entity;


import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * (User)实体类
 *
 * @author Anyu
 * @since 2020-10-19 18:02:22
 */
public class User implements Serializable {
    private static final long serialVersionUID = 672990308600098053L;
    /**
    * 用户ID
    */
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
    private Object gender;
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
    
    private Object status;
    /**
    * 创建时间
    */
    private LocalDateTime createtime;
    /**
    * 修改时间
    */
    private LocalDateTime modifiedtime;


}