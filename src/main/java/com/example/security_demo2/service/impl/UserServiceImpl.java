package com.example.security_demo2.service.impl;

import com.example.security_demo2.entity.User;
import com.example.security_demo2.mapper.UserMapper;
import com.example.security_demo2.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xuzihao
 * @since 2022-01-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
