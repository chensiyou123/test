package com.csy.test.service;

import com.csy.test.util.Result;
import com.csy.test.entity.User;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface UserService {

    /**
     * 添加用户信息
     * @param u
     * @return
     */
    Result save(User u);


    Result query(Map map);

}
