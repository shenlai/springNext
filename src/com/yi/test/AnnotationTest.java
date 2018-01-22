package com.yi.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yi.annotation.Product;
import com.yi.annotation.autowired.PersonService;


public class AnnotationTest {

	@Test
	public void testConstrutor(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Product product = (Product) context.getBean("pr");
		product.setPname("É¢¿Í¼Û");
		System.out.println(product.getPname());
	}
	
	@Test
	public void testResource(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Product product = (Product) context.getBean("pr");
		product.ShowUnit();
	}
	
	
	@Test
	public void testAutowired(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService service = (PersonService) context.getBean("personService");
		service.savePerson();
	}
	
}
