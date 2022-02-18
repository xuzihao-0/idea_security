package com.example.security_demo2.mapper;

import com.example.security_demo2.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xuzihao
 * @since 2022-01-28
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
        List<User> selectall();
        User selectO(int num);
        User selectOaa(User user);
}
