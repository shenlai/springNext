package com.sl.jdk;
import org.junit.Test;

public class IntegerTest {
	
	@Test
	public void pub() {
		int x=Character.digit('c', 16);
		System.out.println("x="+x);
		
		int A = Integer.parseInt("A", 16);
		int a = Integer.parseInt("a", 16);
		
		Integer integer0 = Integer.valueOf(1);   //IntegerCache�����ж�ȡ
		Integer integer1 = new Integer(1);        //������ʵ��
		Integer integer2 = new Integer(1);        //������ʵ��
		System.out.println(integer1.equals(integer2)); //true Integer.equal�ڲ�ʵ�ֲ����ǱȽ�����Integer��������ã����ǱȽ�Integer.valueֵ�Ƿ����
		System.out.println(integer1==integer2); //false integer1��integer2��������ͬ�Ķ������ò�һ��
		
		 Integer integer3 = 1;
        Integer integer4 = 1;
        System.out.println(integer3 == integer4);//true��integer3��integer4�����װ�䣬��IntegerCache��ȡ����ͬ��ʵ��
        
        Integer integer8 = 128;
        Integer integer9 = 128;
        System.out.println(integer8 == integer9);//false��integer8��integer9�����װ��,New Integer(128)==new Integer(128)

        System.out.println(integer3 == integer1);//false��integer3ͨ������valueof����װ�����  ʵ���൱�� Integer.valueOf(1)==integer1
        System.out.println(integer3 == integer0);//true��integer3ͨ������valueof����װ�����  ʵ���൱�� Integer.valueOf(1)==integer0 ,����IntegerCache�����ж�ȡ
        
        int integer5 = 1;
        Integer integer6 = new Integer(1);
        
        System.out.println(integer5 == integer5);//true ��Integer�����int�Ƚ�ʱ��Integer�������intValue����Զ����䣬ת��Ϊint���൱������int�ͱȽ�

		Integer integer7 = 1;
		System.out.println(integer7==integer5);  //true integer7��װ�䣬�Ƚ�ʱ�����˲������

		
	} 
	

}
