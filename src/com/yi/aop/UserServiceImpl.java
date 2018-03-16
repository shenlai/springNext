package com.yi.aop;

public class UserServiceImpl implements UserService{
    @Override
    public void addUser(User user) {
    	int i = 1/0; //Å×Òì³£
        System.out.println("Ôö¼Ó User");
    }
    @Override
    public void deleteUser(int uid) {
        System.out.println("É¾³ý User");
    }
}