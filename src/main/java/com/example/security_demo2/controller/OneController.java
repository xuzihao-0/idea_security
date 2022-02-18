package com.example.security_demo2.controller;

import com.example.security_demo2.entity.User;
import com.example.security_demo2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OneController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("index")
    public User hello(){
        List<User> list = userMapper.selectall();
        User user2 = userMapper.selectO(1);
        User user1 = new User();
        user1.setId(1);
        user1.setUsername("root");
        User user = userMapper.selectOaa(user1);
        return user2;





    }
    @GetMapping("haha")
        public String haha(){
            return "hahdfdsfsa";
        }

}
