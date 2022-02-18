package com.example.security_demo2.service.impl;

import com.example.security_demo2.entity.Role;
import com.example.security_demo2.mapper.RoleMapper;
import com.example.security_demo2.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
