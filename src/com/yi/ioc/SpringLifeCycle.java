package com.yi.ioc;

/**
 * Spring ��������������
 * @author laishen
 *
 */
public class SpringLifeCycle {
	public SpringLifeCycle() {
		System.out.println("SpringLifeCycle");
	}
	
	//�����ʼ������
	public void init() {
		System.out.println("SpringLifeCycle:init...");
	}
	
	//�������ٷ���
	public void destroy(){
		System.out.println("SpringLifeCycle:destory...");
	}
	
	public void sayHello() {
		System.out.println("SpringLifeCycle: say Hello...");
	}
}



