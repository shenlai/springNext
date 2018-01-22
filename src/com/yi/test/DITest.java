package com.yi.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yi.di.Person;

public class DITest {
	
	//利用 set 方法给对象赋值
	@Test
	public void testSet(){
		//1、启动 spring 容器
		//2、从 spring 容器中取出数据
		//3、通过对象调用方法
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.getPname());
	}
	
	//利用 构造函数 给对象赋值
	@Test
	public void testConstrutor(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("person_con");
		System.out.println(person.getPid());//1
	}
	
	

}
