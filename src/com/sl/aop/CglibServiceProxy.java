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
        
        //设置父类类型,目的是将被代理的对象类型传入,因为cglib最终是会为目标类创建一个子类
        enhancer.setSuperclass(this.targetClass.getClass());
        
        // 设置回调，目的是后续对代理类中的方法的调用会转到该回调中， 
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
