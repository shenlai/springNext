package com.sl.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect  //∂®“Â«–√Ê
public class OrderLogger {
	
	@Before("execution(* com.sl.aop)")
	public void beforeCreateOrder(){
        System.out.println("before create order");
    }

    public void afterCreateOrder(){
        System.out.println("after create order");
    }
}
