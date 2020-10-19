package com.lslg.hxmall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lslg.hxmall.entity.Cart;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Cart)表数据库访问层
 *
 * @author Anyu
 * @since 2020-10-19 18:01:26
 */
@Mapper
public interface CartMapper extends BaseMapper<Cart> {
}