package com.yi.test;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yi.aop.MyTransaction;
import com.yi.aop.ObjectInterceptor;
import com.yi.aop.UserService;
import com.yi.aop.UserServiceImpl;

public class AOPTest {

	@Test
	public void testAop(){
		Object target  = new UserServiceImpl();
		
		MyTransaction transaction = new MyTransaction();
		
		 ObjectInterceptor proxyObject = new ObjectInterceptor(target, transaction);
		 
		 UserService userService = (UserService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
	                target.getClass().getInterfaces(), proxyObject);
	        userService.addUser(null);
	}
	
	
	
	@Test
	public void testAopConfig(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService useService = (UserService) context.getBean("userService");
        useService.addUser(null);
		 
	}
	
	
	
}
