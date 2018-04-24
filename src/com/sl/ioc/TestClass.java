package com.sl.ioc;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=AnimalConfig.class)
public class TestClass {

	//@Autowired
	//private Dog dog;
	
	@Test
	public void TestGetDoInstance() {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfig.class);
		Dog dog = (Dog) context.getBean("dog", Dog.class);
		assertNotNull(dog);
		//dog.setWeight(60);
		//System.out.printf("dog weight:",dog.getWeight());
	}
	
	
}
