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
     * ����������� 
     *
     */  
    public Object getInstance() { 
        Enhancer enhancer = new Enhancer();  
        
        //����Ŀ���ࣨ��Ҫ��������ࣩ  
        enhancer.setSuperclass(this.targetClass.getClass());
        
        // �ص�����  
        enhancer.setCallback(this);
        
        // �����������  
        return enhancer.create();  
    }  
  
    /** 
     * ��������Ŀ���෽���ĵ��� 
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
