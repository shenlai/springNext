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
	
	/**
	 *  ����Ĭ�ϵĹ��췽��
	 */
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
	
	
	/**
     * Spring �������þ�̬����������������
     */
    @Test
	public void createObjectStaticFactory() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloIoc staticFactory = (HelloIoc) context.getBean("helloStaticFactory");
		
		staticFactory.sayHelloV2();
		
	}
	
    
    /**
     * Spring ��������ʵ������������������
     */
    @Test
    public void createObjectInstanceFactory(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloIoc staticFactory =
                (HelloIoc) context.getBean("instance");
        staticFactory.sayHelloV3();
    }
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
