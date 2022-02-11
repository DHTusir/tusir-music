package com.tusir.tusirmusic.controller;

import com.tusir.tusirmusic.mapper.UserMapper;
import com.tusir.tusirmusic.service.UserService;
import com.tusir.tusirmusic.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Tusir
 * @version 1.0.0
 */
@RestController
@RequestMapping("/users")
public class UserController {

    UserService userService; //在这里@Autowired的话启动Controller的时候就会直接注入，不推荐

    UserMapper userMapper;

    @GetMapping("/")
    List<UserVo> list(){
        return userService.list()
                .stream().map(userMapper::toVo).collect(Collectors.toList());
    }

    @Autowired //这里是用的时候才注入
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
