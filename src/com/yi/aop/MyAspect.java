package com.yi.aop;
import org.aspectj.lang.JoinPoint;

public class MyAspect {
	/**
     * JoinPoint 能获取目标方法的一些基本信息
     * @param joinPoint
     */
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知 ： " + joinPoint.getSignature().getName());
    }
     
    public void myAfterReturning(JoinPoint joinPoint,Object ret){
        System.out.println("后置通知 ： " + joinPoint.getSignature().getName() + " , -->" + ret);
    }
     
    public void myAfter(){
        System.out.println("最终通知");
    }
    
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("抛出异常通知 ： " + e.getMessage());
    }
}
