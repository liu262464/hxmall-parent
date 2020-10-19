package com.lslg.hxmall.entity;


import com.baomidou.mybatisplus.annotation.*;
import com.lslg.hxmall.entity.enums.PayTypeEnum;
import com.lslg.hxmall.entity.enums.TradeStateEnum;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * (PayLog)实体类
 *
 * @author Anyu
 * @since 2020-10-19 18:02:19
 */
@TableName(value = "pay_log")
public class PayLog implements Serializable {
    private static final long serialVersionUID = 767844724279614243L;
    /**
    * id
    */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
    * 订单号
    */
    private String orderNo;
    /**
    * 支付时间
    */
    private LocalDateTime payTime;
    /**
    * 支付金额（分）
    */
    private BigDecimal totalFee;
    /**
    * 交易流水号
    */
    private String transactionId;
    /**
    * 交易状态
    */
    private TradeStateEnum tradeState;
    /**
    * 支付类型
    */
    private PayTypeEnum payType;
    /**
    * 0-存在，1-逻辑删除
    */
    @TableLogic
    private Integer status;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createtime;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime modifiedtime;


}