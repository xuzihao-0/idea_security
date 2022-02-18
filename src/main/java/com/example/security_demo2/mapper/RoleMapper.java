package com.example.security_demo2.mapper;

import com.example.security_demo2.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xuzihao
 * @since 2022-01-28
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

}
