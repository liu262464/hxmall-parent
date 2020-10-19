package com.lslg.hxmall.service.impl;

import com.lslg.hxmall.entity.Product;
import com.lslg.hxmall.mapper.ProductMapper;
import com.lslg.hxmall.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * (Product)表服务实现类
 *
 * @author Anyu
 * @since 2020-10-19 18:02:21
 */
@Service("productService")
public class ProductServiceImpl extends ServiceImpl<ProductMapper,Product> implements ProductService {
  
}