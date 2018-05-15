package com.sl.aop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import sun.misc.ProxyGenerator;

public class AopTest {
	
	@Test
	public void TestAspectAop() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("aoptextbean.xml");
		OrderService orderService =	(OrderService)context.getBean("orderServiceImpl");
		orderService.createOrder();
		System.out.println("-----------------------");
		orderService.createOrder("888");
	}

	//@Test
	public void Testdynamicproxy() throws IOException {
	
		/*
		OrderServiceImpl serviceImpl = new OrderServiceImpl();
		OrderLogger logger = new OrderLogger();
		OrderService service = (OrderService) new ServiceProxy(serviceImpl, logger).GetDynamicProxy();
		service.createOrder();
		 
		//createProxyClassFile();
		
		*/
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\class");
		OrderServiceImpl serviceImpl = new OrderServiceImpl();
		OrderLogger logger = new OrderLogger();
		CglibServiceProxy proxy = new CglibServiceProxy(serviceImpl,logger);  
		  //通过生成子类的方式创建代理类  
		OrderServiceImpl proxyImp = (OrderServiceImpl)proxy.getInstance();
		proxyImp.createOrder();
		
	}

	private static void createProxyClassFile(){  
        String name = "ProxyObject";  
        byte[] data = ProxyGenerator.generateProxyClass(name,new Class[]{OrderService.class});  
        FileOutputStream out =null;  
        try {  
            out = new FileOutputStream(name+".class");  
            System.out.println((new File("hello")).getAbsolutePath());  
            out.write(data);  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }finally {  
            if(null!=out) try {  
                out.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    } 
}
