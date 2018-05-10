package com.sl.aop;

//@Aspect  //∂®“Â«–√Ê
public class OrderLogger {
	
	//@Before("execution(* com.sl.aop)")
	public void beforeCreateOrder(){
        System.out.println("before create order");
    }

    public void afterCreateOrder(){
        System.out.println("after create order");
    }
}
