package com.zhaodf.Bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * 类：User
 *
 * @author zhaodf
 * @date 2021/2/22
 */
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
        System.out.println("User已加载！");
    }
}
