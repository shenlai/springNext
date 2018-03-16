package com.yi.aop;

import org.springframework.stereotype.Service;

//目标类
@Service("userServiceTwo")
public class UserServiceImplTwo implements UserService{
    @Override
    public void addUser(User user) {
    	//int i = 1/0; //抛异常
        System.out.println("Two增加 User");
    }
    @Override
    public void deleteUser(int uid) {
        System.out.println("Two删除 User");
    }
}
