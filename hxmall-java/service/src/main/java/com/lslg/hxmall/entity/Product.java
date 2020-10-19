package com.lslg.hxmall.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * (Product)实体类
 *
 * @author Anyu
 * @since 2020-10-19 18:02:43
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 990046723926746200L;
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

}