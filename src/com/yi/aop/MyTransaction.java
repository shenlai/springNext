package com.yi.aop;

public class MyTransaction {
	//��������
    public void before(){
        System.out.println("��������");
    }
    //�ύ����
    public void after(){
        System.out.println("�ύ����");
    }
    
  
}
