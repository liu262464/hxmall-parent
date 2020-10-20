package com.lslg.hxmall.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author Enzo
 * @Date 2020/10/20 8:31
 * @Version 1.0.0
 */
@Component
public class ConstantUtils implements InitializingBean {
    /**
     * 关联的公众号appid
     */
    @Value("${weixin.pay.appid}")
    private String appid;

    /**
     * 商户号
     */
    @Value("${weixin.pay.partner}")
    private String partner;

    /**
     * 商户key
     */
    @Value("${weixin.pay.partnerkey}")
    private String partnerkey;

    /**
     * 回调地址
     */
    @Value("${weixin.pay.notifyurl}")
    private String notifyurl;

    public static String APP_ID;

    public static String PARTNER;

    public static String PARTNER_KEY;

    public static String NOTIFY_URL;
    @Override
    public void afterPropertiesSet() throws Exception {
        APP_ID = appid;
        PARTNER = partner;
        PARTNER_KEY = partnerkey;
        NOTIFY_URL = notifyurl;
    }
}
