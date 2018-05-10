package com.sl.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ServiceProxy implements InvocationHandler {

	private Object targetClass;
	private OrderLogger orderLogger;

	public ServiceProxy(Object targetClass,OrderLogger orderLogger) {
		this.targetClass = targetClass;
		this.orderLogger = orderLogger;
	}
	
	//��ȡ����
	public Object GetDynamicProxy()
	{
		return Proxy.newProxyInstance(targetClass.getClass().getClassLoader(), //ͨ�����ClassLoader���ɴ������
				targetClass.getClass().getInterfaces(),//��������ʵ�ֵĽӿ�
				this);  //��̬������÷����ǹ�����InvocationHandler,����ͨ����InvocationHandler��invoke����ִ�������ķ���
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.orderLogger.beforeCreateOrder();
		Object result= method.invoke(targetClass, args);
		this.orderLogger.afterCreateOrder();
		
		return result;
	}

}
