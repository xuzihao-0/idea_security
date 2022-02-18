package com.example.security_demo2.config;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.security_demo2.entity.Role;
import com.example.security_demo2.entity.User;
import com.example.security_demo2.entity.UserRole;
import com.example.security_demo2.mapper.RoleMapper;
import com.example.security_demo2.mapper.UserMapper;
import com.example.security_demo2.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@Component
public class MyUserDeatailService implements UserDetailsService {
    
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        QueryWrapper<User> qw = new QueryWrapper<>();
        HashMap<String, Object> mm = new HashMap<>();
        mm.put("username", username);
        qw.allEq(mm);
        User user1 = userMapper.selectOne(qw);


        HashMap<String, Object> mm1 = new HashMap<>();
        mm1.put("uid", user1.getId());

        List<UserRole> userRoles = userRoleMapper.selectByMap(mm1);
        HashMap<String, Object> mm2 = new HashMap<>();


        Iterator<UserRole> iterator = userRoles.iterator();
        List<Role> rr = new ArrayList<>();
        while (iterator.hasNext()){
            UserRole next = iterator.next();
            mm2.put("id", next.getRid());
            List<Role> roles = roleMapper.selectByMap(mm2);
            rr.addAll(roles);
        }
        user1.setRoles(rr);

        System.out.println("`````````````````````````````````````");
        System.out.println("`````````````````````````````````````");
        System.out.println(user1);
        System.out.println("````````````````````````````````````````");
        System.out.println("````````````````````````````````````````");
        return user1;
    }
}
