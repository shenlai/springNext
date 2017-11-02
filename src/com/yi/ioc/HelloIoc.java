package com.yi.ioc;

public class HelloIoc {
	
	public void sayHello() {
		System.out.println("Hello IOC default Construtor");
	}
	
	public void sayHelloV2() {
		System.out.println("Hello IOC helloStaticFactory");
	}
	
	public void sayHelloV3() {
		System.out.println("Hello IOC instanceFactory");
	}
}
