package com.sl.aop;

//@Aspect  //��������
public class OrderLogger {
	
	//@Before("execution(* com.sl.aop)")
	public void beforeCreateOrder(){
        System.out.println("before create order");
    }

    public void afterCreateOrder(){
        System.out.println("after create order");
    }
}
