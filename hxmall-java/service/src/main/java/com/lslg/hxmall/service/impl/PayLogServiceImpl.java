package com.lslg.hxmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.wxpay.sdk.WXPayUtil;
import com.lslg.hxmall.base.HxException;
import com.lslg.hxmall.entity.Order;
import com.lslg.hxmall.entity.PayLog;
import com.lslg.hxmall.mapper.PayLogMapper;
import com.lslg.hxmall.service.OrderService;
import com.lslg.hxmall.service.PayLogService;
import com.lslg.hxmall.utils.ConstantUtils;
import com.lslg.hxmall.utils.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


/**
 * (PayLog)表服务实现类
 *
 * @author Anyu
 * @since 2020-10-19 18:02:20
 */
@Service("payLogService")
public class PayLogServiceImpl extends ServiceImpl<PayLogMapper, PayLog> implements PayLogService {

    @Autowired
    OrderService orderService;

    @Override
    public Map<String, Object> createQr(String orderNo) {
        try {
            //根据订单编号 拿取订单信息
            QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("order_no", orderNo);
            Order order = orderService.getOne(queryWrapper);

            //存放二维码地址信息相关集合
            Map<String, String> vxMap = new HashMap<>();

            //1.设置支付参数
            vxMap.put("appid", ConstantUtils.APP_ID);
            vxMap.put("mch_id", ConstantUtils.PARTNER);
            //vx规则随机数
            vxMap.put("nonce_str", WXPayUtil.generateNonceStr());
            vxMap.put("body", String.valueOf(order.getProductId()));
            //生成微信支付的订单号
            vxMap.put("out_trade_no", orderNo);
            vxMap.put("total_fee", order.getPrice().multiply(new BigDecimal("100")).longValue() + "");
            vxMap.put("spbill_create_ip", "127.0.0.1");
            vxMap.put("notify_url", ConstantUtils.NOTIFY_URL);
            vxMap.put("trade_type", "NATIVE");

            //利用httpclient工具类进行请求
            HttpClient client = new HttpClient("https://api.mch.weixin.qq.com/pay/unifiedorder");
            client.setXmlParam(WXPayUtil.generateSignedXml(vxMap, ConstantUtils.PARTNER_KEY));
            client.setHttps(true);
            client.post();

            //返回数据
            String xml = client.getContent();
            //将放回的xml类型数据用vx提供的工具类进行转换
            Map<String, String> resultMap = WXPayUtil.xmlToMap(xml);
            //封装返回的map对象
            Map map = new HashMap<>();
            map.put("out_trade_no", orderNo);
            map.put("total_fee", order.getPrice());
            map.put("result_code", resultMap.get("result_code"));
            map.put("code_url", resultMap.get("code_url"));

            return map;
        } catch (Exception e) {
            throw new HxException(20001,"生成二维码地址失败!");
        }

    }
}