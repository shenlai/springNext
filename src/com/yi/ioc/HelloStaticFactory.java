package com.yi.ioc;

public class HelloStaticFactory {
	public HelloStaticFactory()
	{
		System.out.println("HelloStaticFactory constructor");
	}
	
	//静态工厂方法
	public static HelloIoc getInstances() {
		return new HelloIoc();
	}
}
