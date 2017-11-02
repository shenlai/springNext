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
	 *  利用默认的构造方法
	 */
	@Test
	public void testCreateObjectByConstrutor() {
		//1、启动spring 容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2、从spring容器中读取出数据
		HelloIoc ioc = (HelloIoc)context.getBean("helloIoc");
		
		//通过对象调用方法
		ioc.sayHello();
		
		//利用配置文件 alias别名属性 创建对象
		HelloIoc ioc2 = (HelloIoc)context.getBean("helloIoc2");
		ioc2.sayHello();
		
	}
	
	
	/**
     * Spring 容器利用静态工厂方法创建对象
     */
    @Test
	public void createObjectStaticFactory() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloIoc staticFactory = (HelloIoc) context.getBean("helloStaticFactory");
		
		staticFactory.sayHelloV2();
		
	}
	
    
    /**
     * Spring 容器利用实例工厂方法创建对象
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
