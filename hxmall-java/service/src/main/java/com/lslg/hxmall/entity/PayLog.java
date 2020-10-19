package com.lslg.hxmall.entity;


import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * (PayLog)实体类
 *
 * @author Anyu
 * @since 2020-10-19 18:02:19
 */
public class PayLog implements Serializable {
    private static final long serialVersionUID = 767844724279614243L;
    /**
    * id
    */
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
    private Double totalFee;
    /**
    * 交易流水号
    */
    private String transactionId;
    /**
    * 交易状态
    */
    private Object tradeState;
    /**
    * 支付类型
    */
    private Object payType;
    /**
    * 0-存在，1-逻辑删除
    */
    private Object status;
    
    private LocalDateTime createtime;
    
    private LocalDateTime modifiedtime;



}