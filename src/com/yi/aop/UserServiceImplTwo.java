package com.yi.aop;

import org.springframework.stereotype.Service;

//Ŀ����
@Service("userServiceTwo")
public class UserServiceImplTwo implements UserService{
    @Override
    public void addUser(User user) {
    	//int i = 1/0; //���쳣
        System.out.println("Two���� User");
    }
    @Override
    public void deleteUser(int uid) {
        System.out.println("Twoɾ�� User");
    }
}
