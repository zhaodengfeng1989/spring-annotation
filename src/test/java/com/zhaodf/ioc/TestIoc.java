package com.zhaodf.ioc;

import com.zhaodf.Bean.Role;
import com.zhaodf.Bean.User;
import com.zhaodf.controller.UserController;
import com.zhaodf.service.UserService;
import com.zhaodf.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类：TestIoc
 *
 * @author zhaodf
 * @date 2021/1/21
 */
public class TestIoc {
    ClassPathXmlApplicationContext ioc;

    @Before
    public void before() {
        ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        System.out.println("Spring容器加载完成");
    }

    @Test
    public void test01() {
        UserController userController = ioc.getBean("userController", UserController.class);
        System.out.println(userController);
    }

    @Test
    public void test02() {
        UserService userService = ioc.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(userService);
        UserController userController = ioc.getBean("userController", UserController.class);
        System.out.println(userController);
    }

    @Test
    public void test03() {
        UserController userController = ioc.getBean("userController", UserController.class);
        userController.getUser();
    }

    @Test
    public void test04() {
        Role bean = ioc.getBean(Role.class);
        System.out.println(bean.getName());
    }

    @Test
    public void test05() {
        Role role1 = ioc.getBean(Role.class);
        Role role2 = ioc.getBean(Role.class);
    }

    @Test
    public void test06() {
        Role role = ioc.getBean(Role.class);
        System.out.println(role);
        ioc.close();
    }
}