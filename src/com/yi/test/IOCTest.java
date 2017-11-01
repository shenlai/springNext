/**
 * 
 */
package com.yi.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yi.ioc.HelloIoc;

/**
 * @author laishen
 *
 */

public class IOCTest {
	
		
	@Test
	public void testCreateObjectByConstrutor() {
		//1������spring ����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2����spring�����ж�ȡ������
		HelloIoc ioc = (HelloIoc)context.getBean("helloIoc");
		
		//ͨ��������÷���
		ioc.sayHello();
		
		//���������ļ� alias�������� ��������
		HelloIoc ioc2 = (HelloIoc)context.getBean("helloIoc2");
		ioc2.sayHello();
		
	}
}
