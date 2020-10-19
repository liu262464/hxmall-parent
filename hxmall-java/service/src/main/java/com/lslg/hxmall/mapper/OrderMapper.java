package com.lslg.hxmall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lslg.hxmall.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Order)表数据库访问层
 *
 * @author Anyu
 * @since 2020-10-19 18:03:09
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}