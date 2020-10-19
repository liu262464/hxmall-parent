package com.lslg.hxmall.entity;

import java.util.LocalDateTime;
import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author Anyu
 * @since 2020-10-19 18:01:27
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -99637068628404496L;
    /**
    * ID
    */
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
    private Object state;
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
    private Double price;
    
    private Object status;
    
    private LocalDateTime createtime;
    
    private LocalDateTime modifiedtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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