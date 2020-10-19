package com.lslg.hxmall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lslg.hxmall.entity.PayLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * (PayLog)表数据库访问层
 *
 * @author Anyu
 * @since 2020-10-19 18:02:20
 */
@Mapper
public interface PayLogMapper extends BaseMapper<PayLog> {

}