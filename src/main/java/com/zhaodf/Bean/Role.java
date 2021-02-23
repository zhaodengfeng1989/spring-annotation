package com.zhaodf.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 类：Role
 *
 * @author zhaodf
 * @date 2021/2/22
 */
@Component
public class Role {
    @Value("管理员")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role() {
        System.out.println("Role已加载!");
    }

    // 生命周期回调 初始化回调
    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }

    // 生命周期回调 销毁回调
    @PreDestroy
    public  void destory(){
        System.out.println("销毁");
    }
}
