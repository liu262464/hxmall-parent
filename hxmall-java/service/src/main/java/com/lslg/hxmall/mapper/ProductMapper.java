package com.lslg.hxmall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lslg.hxmall.entity.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Product)表数据库访问层
 *
 * @author Anyu
 * @since 2020-10-19 18:02:43
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

}