package com.lslg.hxmall.controller;

import com.lslg.hxmall.commonutils.R;
import com.lslg.hxmall.service.PayLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * (PayLog)表控制层
 *
 * @author Anyu
 * @since 2020-10-19 18:02:20
 */
@RestController
@RequestMapping("payLog")
public class PayLogController {
    @Autowired
    PayLogService payLogService;

    @PostMapping("/createQr/{orderNo}")
    public R createQr(@PathVariable(name = "orderNo") String orderNo){
        Map<String,Object> map = payLogService.createQr(orderNo);
        return R.ok().data(map);
    }

}