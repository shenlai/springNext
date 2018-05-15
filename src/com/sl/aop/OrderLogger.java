package com.sl.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect // 定义切面
public class OrderLogger {

	//定义切点函数
	
	// 前置通知 ：在目标方法被调用之前调用该通知
	//@Before("execution(* com.sl.aop.*.*(..))")
	//@Before("execution(public * com.sl.aop.*.*(..))")
	//@Before("execution(* com.sl.aop.OrderService.*())")
	//@Before("execution(* com.sl.aop.*.*(..)) && this(com.sl.aop.OrderService)")
	//@Before("execution(* com.sl.aop.*.*(..)) && @within(org.springframework.stereotype.Service)")
	public void beforeCreateOrder() {
		System.out.println("before create order");
	}
	
	//使用args处理通知中的参数
	//@Before("execution(public * com.sl.aop.*.*(..)) && args(orderNumber,..)")
	public void beforeCreateOrder(String orderNumber) {
		System.out.println("before create order:"+orderNumber);
	}

	// 后置通知：在目标方法返回或抛异常后调用该通知
	//@After("execution(* com.sl.aop.OrderServiceImpl.createOrder(..))")
	public void afterCreateOrder() {
		System.out.println("after create order");
	}

	// 返回通知：在目标方法正常返回后调用
	//@AfterReturning("execution(* com.sl.aop.OrderServiceImpl.createOrder(..))")
	public void createOrderSuccess() {
		System.out.println("create order success");
	}

	// 异常通知：在目标方法抛出异常后调用
	//@AfterThrowing("execution(* com.sl.aop.OrderServiceImpl.createOrder(..))")
	public void createOrderError() {
		System.out.println("create order error");
	}

	// 异常通知：在目标方法抛出异常后调用
	//@Around("execution(* com.sl.aop.OrderServiceImpl.createOrder(..))")
	public void createOrderAround(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("around before create order");
		jp.proceed();
		System.out.println("around after create order");
	}

}
