package com.zhaodf.controller;

import com.zhaodf.Bean.User;
import com.zhaodf.service.BaseService;
import com.zhaodf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * 类：UserController
 *
 * @author zhaodf
 * @date 2021/2/20
 */
@Controller
public class UserController {
    UserService userService;

    @Autowired
    public UserController(@Qualifier("userServiceImpl")UserService userService) {
        this.userService = userService;
    }

    public void  getUser(){
        userService.getUser();
    }
}
