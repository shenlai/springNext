package com.yi.aop;

public class UserServiceImpl implements UserService{
    @Override
    public void addUser(User user) {
        System.out.println("���� User");
    }
    @Override
    public void deleteUser(int uid) {
        System.out.println("ɾ�� User");
    }
}