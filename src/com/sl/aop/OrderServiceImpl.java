package com.sl.aop;

public class OrderServiceImpl implements OrderService {
	
	@Override
	public void createOrder() {
		System.out.println("creating order");
	}

}
