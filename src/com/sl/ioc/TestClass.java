package com.sl.ioc;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yi.aop.User;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=AnimalConfig.class)
public class TestClass {

	@Test
	public void TestGetDoInstance() {
		
		//应用上下文
		ApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfig.class);
		Dog dog = (Dog)context.getBean("dog");
		dog.Wang();

		Animal animal = (Animal) context.getBean("animal");
		animal.AnimalAction();

		assertSame(dog, animal.getDog());
	}
}
