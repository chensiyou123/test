package com.csy.test.mapper;

import com.csy.test.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * 添加用户
     * @param user
     * @return
     */
    int save(User user);
}
