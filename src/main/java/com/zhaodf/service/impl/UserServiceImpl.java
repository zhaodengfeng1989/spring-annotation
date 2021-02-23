package com.zhaodf.service.impl;

import com.zhaodf.dao.UserDao;
import com.zhaodf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类：UserService
 *
 * @author zhaodf
 * @date 2021/2/20
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public void getUser() {
        System.out.println("调用UserServiceImpl的getUser");
        userDao.getUser();
    }
}
