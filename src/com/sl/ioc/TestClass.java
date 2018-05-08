package com.sl.ioc;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=AnimalConfig.class)
public class TestClass {

	
	@Test
	public void TestGetDoInstance() {
		//应用上下文
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfig.class);
		
		AnimalInstance animalInstance = context.getBean(AnimalInstance.class);
		animalInstance.animal.Say();
		
		
	/*	String[] beanNames = context.getBeanDefinitionNames();

        for(String bean : beanNames) {

                System.out.println(bean);

        }
		*/
		/*System.setProperty("dog", "122");
		
		Animal animal = context.getBean(Animal.class);
		
		animal.Say();*/
		
	}
}
