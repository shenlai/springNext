/**
 * 
 */
package com.yi.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.yi.ioc.HelloIoc;
import com.yi.ioc.SpringLifeCycle;

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
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//2����spring�����ж�ȡ������
		//HelloIoc ioc = (HelloIoc)context.getBean("helloIoc");
		
		//ͨ��������÷���
		//ioc.sayHello();
		
		//���������ļ� alias�������� ��������
		//HelloIoc ioc2 = (HelloIoc)context.getBean("helloIoc2");
		//ioc2.sayHello();
		
	}
	
	
	/**
     * Spring �������þ�̬����������������
     */
    //@Test
	public void createObjectStaticFactory() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloIoc staticFactory = (HelloIoc) context.getBean("helloStaticFactory");
		
		staticFactory.sayHelloV2();
		
	}
	
    
    /**
     * Spring ��������ʵ������������������
     */
    //@Test
    public void createObjectInstanceFactory(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloIoc staticFactory =
                (HelloIoc) context.getBean("instance");
        staticFactory.sayHelloV3();
    }
    
    
    /**
     * spring ����Ĭ�ϲ��������ǵ����� scope="singleton"
     */
    //@Test
    public void test_scope_singleton_CreateObject() {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	HelloIoc hello1 = (HelloIoc)context.getBean("helloIoc");
    	HelloIoc hello2 = (HelloIoc)context.getBean("helloIoc");
    	System.out.println(hello1.equals(hello2));
    	
    }
    
    
    /**
     * //spring �����ĳ�ʼ��������
     * 
     * 
               ������spring ��������������
���� ��   1��spring������������
        ����2��ִ��init����
        ����3�������Լ��ķ���
        ����4����spring�����رյ�ʱ��ִ��destroy����
����	 ע�⣺��scopeΪ"prototype"ʱ������ close���� ����ʱ�ǲ������ destroy ������
     */
    // @Test
    public void testSpringLifeCycle() {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	SpringLifeCycle hello = (SpringLifeCycle)context.getBean("springLifeCycle");
    	hello.sayHello();
    	
    	//����spring����
    	ClassPathXmlApplicationContext classContext = (ClassPathXmlApplicationContext) context;
    	
    	classContext.close();
    	
    }
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
