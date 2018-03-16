package com.yi.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yi.aop.UserService;

public class AopAnnotationTest {

	@Test
    public void testAopAnnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService useService = (UserService) context.getBean("userServiceTwo");
        useService.addUser(null);
        useService.deleteUser(1);
    }
}
