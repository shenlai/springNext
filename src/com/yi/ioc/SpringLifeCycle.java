package com.yi.ioc;

/**
 * Spring 容器的生命周期
 * @author laishen
 *
 */
public class SpringLifeCycle {
	public SpringLifeCycle() {
		System.out.println("SpringLifeCycle");
	}
	
	//定义初始化方法
	public void init() {
		System.out.println("SpringLifeCycle:init...");
	}
	
	//定义销毁方法
	public void destroy(){
		System.out.println("SpringLifeCycle:destory...");
	}
	
	public void sayHello() {
		System.out.println("SpringLifeCycle: say Hello...");
	}
}



