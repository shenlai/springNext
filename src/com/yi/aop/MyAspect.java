package com.yi.aop;
import org.aspectj.lang.JoinPoint;

public class MyAspect {
	/**
     * JoinPoint �ܻ�ȡĿ�귽����һЩ������Ϣ
     * @param joinPoint
     */
    public void myBefore(JoinPoint joinPoint){
        System.out.println("ǰ��֪ͨ �� " + joinPoint.getSignature().getName());
    }
     
    public void myAfterReturning(JoinPoint joinPoint,Object ret){
        System.out.println("����֪ͨ �� " + joinPoint.getSignature().getName() + " , -->" + ret);
    }
     
    public void myAfter(){
        System.out.println("����֪ͨ");
    }
    
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("�׳��쳣֪ͨ �� " + e.getMessage());
    }
}
