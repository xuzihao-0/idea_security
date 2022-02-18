package com.example.security_demo2.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.security_demo2.entity.Role;
import com.example.security_demo2.entity.User;
import com.example.security_demo2.entity.UserRole;
import com.example.security_demo2.mapper.RoleMapper;
import com.example.security_demo2.mapper.UserMapper;
import com.example.security_demo2.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageTranscoder;
import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xuzihao
 * @since 2022-01-28
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;

    @GetMapping("hello")
    public User hello(Integer id){
        //根据用户id查出用户
        User user = userMapper.selectById(id);

        //根据用户id查关联表 得到role_id


        HashMap<String, Object> mm1 = new HashMap<>();
        mm1.put("uid", user.getId());
        List<UserRole> userRoles = userRoleMapper.selectByMap(mm1);

        HashMap<String, Object> mm2= new HashMap<>();
        List<Role> rr = new ArrayList<>();
        Iterator<UserRole> iterator = userRoles.iterator();
        while(iterator.hasNext()){
            UserRole next = iterator.next();
            mm2.put("id", next.getRid());
            List<Role> roles = roleMapper.selectByMap(mm2);
            rr.addAll(roles);

        }
        user.setRoles(rr);


        return user;






    }

}
