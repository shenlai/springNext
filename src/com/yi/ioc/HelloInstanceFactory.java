package com.yi.ioc;

public class HelloInstanceFactory {
	public HelloInstanceFactory(){
        System.out.println("ʵ�������������캯��");
    }
	
	//����ʵ������������������
    public HelloIoc getInstance(){
        HelloIoc instanceIoc = new HelloIoc();
        return instanceIoc;
    }
}
