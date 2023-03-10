package com.dlnu.domain;

import org.springframework.stereotype.Repository;

/**
 * @author haenu
 * @version 1.0
 * @date 2023/02/13 21:21
 */

public class User {
    private String name;
    private int age;

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
