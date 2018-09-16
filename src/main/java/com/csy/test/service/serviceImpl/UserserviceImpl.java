package com.csy.test.service.serviceImpl;

import com.csy.test.util.Result;
import com.csy.test.entity.User;
import com.csy.test.mapper.UserMapper;
import com.csy.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserserviceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result save(User u) {
        userMapper.save(u);
        return Result.success("保存成功");
    }

    @Override
    public Result query(Map map) {
        return null;
    }
}
