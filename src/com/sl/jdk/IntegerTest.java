package com.sl.jdk;
import org.junit.Test;

public class IntegerTest {
	
	@Test
	public void pub() {
		int x=Character.digit('c', 16);
		System.out.println("x="+x);
		
		int A = Integer.parseInt("A", 16);
		int a = Integer.parseInt("a", 16);
		
		Integer integer0 = Integer.valueOf(1);   //IntegerCache缓存中读取
		Integer integer1 = new Integer(1);        //创建新实例
		Integer integer2 = new Integer(1);        //创建新实例
		System.out.println(integer1.equals(integer2)); //true Integer.equal内部实现并不是比较两个Integer对象的引用，而是比较Integer.value值是否相等
		System.out.println(integer1==integer2); //false integer1和integer2是两个不同的对象，引用不一样
		
		 Integer integer3 = 1;
        Integer integer4 = 1;
        System.out.println(integer3 == integer4);//true，integer3和integer4都完成装箱，从IntegerCache中取出相同的实例
        
        Integer integer8 = 128;
        Integer integer9 = 128;
        System.out.println(integer8 == integer9);//false，integer8和integer9都完成装箱,New Integer(128)==new Integer(128)

        System.out.println(integer3 == integer1);//false，integer3通过调用valueof做了装箱操作  实际相当于 Integer.valueOf(1)==integer1
        System.out.println(integer3 == integer0);//true，integer3通过调用valueof做了装箱操作  实际相当于 Integer.valueOf(1)==integer0 ,都从IntegerCache缓存中读取
        
        int integer5 = 1;
        Integer integer6 = new Integer(1);
        
        System.out.println(integer5 == integer5);//true 当Integer对象和int比较时，Integer对象调用intValue完成自动拆箱，转换为int，相当于两个int型比较

		Integer integer7 = 1;
		System.out.println(integer7==integer5);  //true integer7先装箱，比较时又做了拆箱操作

		
	} 
	

}
