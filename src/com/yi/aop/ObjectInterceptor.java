package com.yi.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ObjectInterceptor implements InvocationHandler {

	//Ŀ����
	private Object target;
	
	//������
	private MyTransaction transaction;
	
	//ͨ����������ֵ
	public ObjectInterceptor(Object target,MyTransaction transaction) {
		this.target =target;
		this.transaction = transaction;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		this.transaction.before();
		
		method.invoke(this.target, args);
		
		this.transaction.after();
		
		return null;
	}
	
	

}
