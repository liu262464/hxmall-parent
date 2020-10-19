package com.lslg.hxmall.entity;

import java.util.LocalDateTime;
import java.io.Serializable;

/**
 * (Product)实体类
 *
 * @author Anyu
 * @since 2020-10-19 18:02:20
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 408337528957669811L;
    /**
    * id
    */
    private Integer id;
    /**
    * 商品名
    */
    private String name;
    /**
    * 商品的描述
    */
    private String desp;
    /**
    * 商品图片路径
    */
    private String imgUrl;
    /**
    * 价格
    */
    private Double price;
    /**
    * 类型
    */
    private Object type;
    /**
    * 库存
    */
    private Integer total;
    /**
    * 已卖数量
    */
    private Integer saleNum;
    /**
    * 0- 正常 1-删除
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
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