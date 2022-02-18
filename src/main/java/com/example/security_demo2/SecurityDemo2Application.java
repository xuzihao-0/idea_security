package com.example.security_demo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@MapperScan("com.example.security_demo2.mapper")

public class SecurityDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(SecurityDemo2Application.class, args);
    }

}
