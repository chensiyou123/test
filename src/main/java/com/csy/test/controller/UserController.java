package com.csy.test.controller;

import com.csy.test.util.CommonUtil;
import com.csy.test.util.Result;
import com.csy.test.entity.User;
import com.csy.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("hello")
    public Map getUser(){
        Map resultMap = new HashMap();
        return resultMap;
    }

    @GetMapping
    public Result save(User user){
        User target = new User();
        target.setId(CommonUtil.getUUID());
        target.setName("小明");
        target.setPassword("123");
        target.setAge(18);
        return userService.save(target);
    }
}
