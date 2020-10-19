package com.lslg.hxmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lslg.hxmall.entity.User;
import com.lslg.hxmall.mapper.UserMapper;
import com.lslg.hxmall.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * (User)表服务实现类
 *
 * @author Anyu
 * @since 2020-10-19 18:02:23
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
  
}