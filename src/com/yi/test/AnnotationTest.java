package com.yi.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yi.annotation.Product;


public class AnnotationTest {

	@Test
	public void testConstrutor(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Product product = (Product) context.getBean("product");
		System.out.println(product.getPname());
	}
	
}
