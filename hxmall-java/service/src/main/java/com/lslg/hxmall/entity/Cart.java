package com.lslg.hxmall.entity;


import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * (Cart)实体类
 *
 * @author Anyu
 * @since 2020-10-19 18:01:24
 */
@TableName(value = "cart")
public class Cart implements Serializable {
    private static final long serialVersionUID = -92754826832608974L;
    /**
    * id
    */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
    * 用户ID
    */
    private Integer userId;
    /**
    * 商品ID
    */
    private Integer productId;
    /**
    * 数量
    */
    private Integer num;

    @TableLogic
    private Integer status;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createtime;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime modifiedtime;




}