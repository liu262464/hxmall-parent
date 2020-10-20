package com.lslg.hxmall.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.lslg.hxmall.entity.enums.PayStateEnum;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * (Order)实体类
 *
 * @author Anyu
 * @since 2020-10-19 18:03:09
 */

@Data
@TableName(value = "order")
public class Order implements Serializable {
    private static final long serialVersionUID = -58702052591724198L;
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 商品ID
     */
    private Integer productId;
    /**
     * 买家ID
     */
    private Integer buyerId;
    /**
     * 卖家id
     */
    private Integer sellerId;
    /**
     * 支付状态 0-未支付，1-已支付
     */
    private PayStateEnum state;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 地址
     */
    private String address;
    /**
     * 商品数量
     */
    private Integer num;
    /**
     * 商品总价
     */
    private BigDecimal price;

    @TableLogic
    private Integer status;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createtime;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime modifiedtime;

}