package com.lslg.hxmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lslg.hxmall.entity.Cart;
import com.lslg.hxmall.mapper.CartMapper;
import com.lslg.hxmall.service.CartService;
import org.springframework.stereotype.Service;


/**
 * (Cart)表服务实现类
 *
 * @author Anyu
 * @since 2020-10-19 18:01:26
 */
@Service("cartService")
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements CartService {


}