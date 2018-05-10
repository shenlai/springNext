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
	
	//获取代理
	public Object GetDynamicProxy()
	{
		return Proxy.newProxyInstance(targetClass.getClass().getClassLoader(), //通过这个ClassLoader生成代理对象
				targetClass.getClass().getInterfaces(),//代理类已实现的接口
				this);  //动态代理调用方法是关联的InvocationHandler,最终通过此InvocationHandler的invoke方法执行真正的方法
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.orderLogger.beforeCreateOrder();
		Object result= method.invoke(targetClass, args);
		this.orderLogger.afterCreateOrder();
		
		return result;
	}

}
