package com.yi.ioc;

public class HelloStaticFactory {
	public HelloStaticFactory()
	{
		System.out.println("HelloStaticFactory constructor");
	}
	
	//��̬��������
	public static HelloIoc getInstances() {
		return new HelloIoc();
	}
}
