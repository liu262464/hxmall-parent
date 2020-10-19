package com.lslg.hxmall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lslg.hxmall.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * (User)表数据库访问层
 *
 * @author Anyu
 * @since 2020-10-19 18:02:24
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}