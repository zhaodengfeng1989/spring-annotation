package com.zhaodf.dao.impl;

import com.zhaodf.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * 类：UserDaoImpl
 *
 * @author zhaodf
 * @date 2021/2/20
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("查询数据库获取User");
    }
}
