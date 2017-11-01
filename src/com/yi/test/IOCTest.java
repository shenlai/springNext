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
}
