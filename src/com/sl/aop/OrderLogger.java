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
@Aspect // ��������
public class OrderLogger {

	//�����е㺯��
	
	// ǰ��֪ͨ ����Ŀ�귽��������֮ǰ���ø�֪ͨ
	//@Before("execution(* com.sl.aop.*.*(..))")
	//@Before("execution(public * com.sl.aop.*.*(..))")
	//@Before("execution(* com.sl.aop.OrderService.*())")
	//@Before("execution(* com.sl.aop.*.*(..)) && this(com.sl.aop.OrderService)")
	//@Before("execution(* com.sl.aop.*.*(..)) && @within(org.springframework.stereotype.Service)")
	public void beforeCreateOrder() {
		System.out.println("before create order");
	}
	
	//ʹ��args����֪ͨ�еĲ���
	//@Before("execution(public * com.sl.aop.*.*(..)) && args(orderNumber,..)")
	public void beforeCreateOrder(String orderNumber) {
		System.out.println("before create order:"+orderNumber);
	}

	// ����֪ͨ����Ŀ�귽�����ػ����쳣����ø�֪ͨ
	//@After("execution(* com.sl.aop.OrderServiceImpl.createOrder(..))")
	public void afterCreateOrder() {
		System.out.println("after create order");
	}

	// ����֪ͨ����Ŀ�귽���������غ����
	//@AfterReturning("execution(* com.sl.aop.OrderServiceImpl.createOrder(..))")
	public void createOrderSuccess() {
		System.out.println("create order success");
	}

	// �쳣֪ͨ����Ŀ�귽���׳��쳣�����
	//@AfterThrowing("execution(* com.sl.aop.OrderServiceImpl.createOrder(..))")
	public void createOrderError() {
		System.out.println("create order error");
	}

	// �쳣֪ͨ����Ŀ�귽���׳��쳣�����
	//@Around("execution(* com.sl.aop.OrderServiceImpl.createOrder(..))")
	public void createOrderAround(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("around before create order");
		jp.proceed();
		System.out.println("around after create order");
	}

}
