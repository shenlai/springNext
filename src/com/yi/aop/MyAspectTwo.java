package com.yi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//������
@Component("myAspectTwo")
@Aspect    //��ͬXML���� <aop:aspect ref="myAspect">
public class MyAspectTwo {
	/**
     * JoinPoint �ܻ�ȡĿ�귽����һЩ������Ϣ
     * @param joinPoint
     */
	@Pointcut("execution(* com.yi.aop.*.*(..))")
	public void myPointCut() {
		
	}
	
	@Before("myPointCut()")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("Twoǰ��֪ͨ �� " + joinPoint.getSignature().getName());
    }
     
	@AfterReturning(value="myPointCut()",returning="ret")
    public void myAfterReturning(JoinPoint joinPoint,Object ret){
        System.out.println("Two����֪ͨ �� " + joinPoint.getSignature().getName() + " , -->" + ret);
    }
     
    public void myAfter(){
        System.out.println("Two����֪ͨ");
    }
    
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("Two�׳��쳣֪ͨ �� " + e.getMessage());
    }
}
