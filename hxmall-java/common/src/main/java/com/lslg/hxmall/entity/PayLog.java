package com.lslg.hxmall.entity;

import java.io.Serializable;
import java.util.LocalDateTime;

/**
 * (PayLog)实体类
 *
 * @author Anyu
 * @since 2020-10-19 18:01:28
 */
public class PayLog implements Serializable {
    private static final long serialVersionUID = 153742349195955891L;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public Double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Object getTradeState() {
        return tradeState;
    }

    public void setTradeState(Object tradeState) {
        this.tradeState = tradeState;
    }

    public Object getPayType() {
        return payType;
    }

    public void setPayType(Object payType) {
        this.payType = payType;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public LocalDateTime getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(LocalDateTime modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

}