package com.yi.aop;

public class UserServiceImpl implements UserService{
    @Override
    public void addUser(User user) {
    	int i = 1/0; //���쳣
        System.out.println("���� User");
    }
    @Override
    public void deleteUser(int uid) {
        System.out.println("ɾ�� User");
    }
}