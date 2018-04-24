package com.sl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class TestClient {
	
	@Test
	public void testLoadConfiguration() {
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		
		HelloBean helloBean = (HelloBean) beanFactory.getBean("hellobean");
		helloBean.setName("test");
		System.out.println(helloBean.getName());
		assertEquals("test", helloBean.getName());
		
	}
	
}
