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
	 *  利用默认的构造方法
	 */
	@Test
	public void testCreateObjectByConstrutor() {
		
		
		//1、启动spring 容器
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//2、从spring容器中读取出数据
		//HelloIoc ioc = (HelloIoc)context.getBean("helloIoc");
		
		//通过对象调用方法
		//ioc.sayHello();
		
		//利用配置文件 alias别名属性 创建对象
		//HelloIoc ioc2 = (HelloIoc)context.getBean("helloIoc2");
		//ioc2.sayHello();
		
	}
	
	
	/**
     * Spring 容器利用静态工厂方法创建对象
     */
    //@Test
	public void createObjectStaticFactory() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloIoc staticFactory = (HelloIoc) context.getBean("helloStaticFactory");
		
		staticFactory.sayHelloV2();
		
	}
	
    
    /**
     * Spring 容器利用实例工厂方法创建对象
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
     * spring 容器默认产生对象是单例的 scope="singleton"
     */
    //@Test
    public void test_scope_singleton_CreateObject() {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	HelloIoc hello1 = (HelloIoc)context.getBean("helloIoc");
    	HelloIoc hello2 = (HelloIoc)context.getBean("helloIoc");
    	System.out.println(hello1.equals(hello2));
    	
    }
    
    
    /**
     * //spring 容器的初始化和销毁
     * 
     * 
               分析：spring 容器的声明周期
　　 　   1、spring容器创建对象
        　　2、执行init方法
        　　3、调用自己的方法
        　　4、当spring容器关闭的时候执行destroy方法
　　	 注意：当scope为"prototype"时，调用 close（） 方法时是不会调用 destroy 方法的
     */
    // @Test
    public void testSpringLifeCycle() {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	SpringLifeCycle hello = (SpringLifeCycle)context.getBean("springLifeCycle");
    	hello.sayHello();
    	
    	//销毁spring容器
    	ClassPathXmlApplicationContext classContext = (ClassPathXmlApplicationContext) context;
    	
    	classContext.close();
    	
    }
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
