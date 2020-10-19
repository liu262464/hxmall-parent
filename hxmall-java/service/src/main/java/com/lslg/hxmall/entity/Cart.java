package com.lslg.hxmall.entity;


import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * (Cart)实体类
 *
 * @author Anyu
 * @since 2020-10-19 18:01:24
 */
public class Cart implements Serializable {
    private static final long serialVersionUID = -92754826832608974L;
    /**
    * id
    */
    private Integer id;
    /**
    * 用户ID
    */
    private Object userId;
    /**
    * 商品ID
    */
    private Object productId;
    /**
    * 数量
    */
    private Object num;
    
    private Object status;
    
    private LocalDateTime modifiedtime;
    
    private LocalDateTime createtime;


}