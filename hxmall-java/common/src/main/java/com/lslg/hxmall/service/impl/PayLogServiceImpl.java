package com.lslg.hxmall.service.impl;

import com.lslg.hxmall.entity.PayLog;
import com.lslg.hxmall.mapper.PayLogMapper;
import com.lslg.hxmall.service.PayLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * (PayLog)表服务实现类
 *
 * @author Anyu
 * @since 2020-10-19 18:01:28
 */
@Service("payLogService")
public class PayLogServiceImpl extends ServiceImpl<PayLogMapper,PayLog> implements PayLogService {
  
}