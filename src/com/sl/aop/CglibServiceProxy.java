package com.sl.aop;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibServiceProxy implements MethodInterceptor {

	private Object targetClass;
	private OrderLogger orderLogger;
	
	
	public CglibServiceProxy(Object targetClass,OrderLogger orderLogger) {
		this.targetClass = targetClass;
		this.orderLogger = orderLogger;
	}
	/** 
     * 创建代理对象 
     *
     */  
    public Object getInstance() { 
        Enhancer enhancer = new Enhancer();  
        
        //设置目标类（需要被代理的类）  
        enhancer.setSuperclass(this.targetClass.getClass());
        
        // 回调方法  
        enhancer.setCallback(this);
        
        // 创建代理对象  
        return enhancer.create();  
    }  
  
    /** 
     * 拦截所有目标类方法的调用 
     *
     */
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		orderLogger.beforeCreateOrder();  
		
        Object o1 = arg3.invokeSuper(arg0, arg2);
		//Object o1 = arg3.invoke(arg0, arg2); 
        
        orderLogger.afterCreateOrder();  
        return o1;  
	}
	

}
