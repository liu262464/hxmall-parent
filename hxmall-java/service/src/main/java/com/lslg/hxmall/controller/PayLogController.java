package com.lslg.hxmall.controller;

import com.lslg.hxmall.commonutils.R;
import com.lslg.hxmall.service.PayLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 根据订单编号生成二维码地址
     * @param orderNo
     * @return
     */
    @PostMapping("/createQr/{orderNo}")
    public R createQr(@PathVariable(name = "orderNo") String orderNo){
        Map<String,Object> map = payLogService.createQr(orderNo);
        return R.ok().data(map);
    }

    @GetMapping("/getPayState/{orderNo}")
    public R getPayState(@PathVariable(name = "orderNo")String orderNo){
        Map map = payLogService.queryPayState(orderNo);
        if(map.get("trade_state").equals("SUCCESS")){
            //订单已支付 改变订单中的状态 并往支付记录表里增添数据
            payLogService.updateState(map);
            return R.ok().message("支付成功");
        }else{
            return R.ok().code(25000).message("等待支付");
        }
    }

}