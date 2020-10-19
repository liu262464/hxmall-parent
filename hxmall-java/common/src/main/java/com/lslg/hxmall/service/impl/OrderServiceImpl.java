package com.lslg.hxmall.service.impl;

import com.lslg.hxmall.entity.Order;
import com.lslg.hxmall.mapper.OrderMapper;
import com.lslg.hxmall.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * (Order)表服务实现类
 *
 * @author Anyu
 * @since 2020-10-19 18:01:27
 */
@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderMapper,Order> implements OrderService {
  
}