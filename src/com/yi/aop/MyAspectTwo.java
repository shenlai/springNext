package com.yi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//切面类
@Component("myAspectTwo")
@Aspect    //等同XML配置 <aop:aspect ref="myAspect">
public class MyAspectTwo {
	/**
     * JoinPoint 能获取目标方法的一些基本信息
     * @param joinPoint
     */
	@Pointcut("execution(* com.yi.aop.*.*(..))")
	public void myPointCut() {
		
	}
	
	@Before("myPointCut()")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("Two前置通知 ： " + joinPoint.getSignature().getName());
    }
     
	@AfterReturning(value="myPointCut()",returning="ret")
    public void myAfterReturning(JoinPoint joinPoint,Object ret){
        System.out.println("Two后置通知 ： " + joinPoint.getSignature().getName() + " , -->" + ret);
    }
     
    public void myAfter(){
        System.out.println("Two最终通知");
    }
    
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("Two抛出异常通知 ： " + e.getMessage());
    }
}
