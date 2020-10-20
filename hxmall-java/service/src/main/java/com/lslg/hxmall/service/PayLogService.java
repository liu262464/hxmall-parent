package com.lslg.hxmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lslg.hxmall.entity.PayLog;

import java.util.Map;

/**
 * (PayLog)表服务接口
 *
 * @author Anyu
 * @since 2020-10-19 18:02:19
 */
public interface PayLogService extends IService<PayLog> {
    Map<String, Object> createQr(String orderNo);

    Map queryPayState(String orderNo);

    void updateState(Map map);
}