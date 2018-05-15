package com.sl.aop;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Override
	public void createOrder() {
		System.out.println("creating order");
	}
	
	@Override
	public void createOrder(String orderNumber) {
		System.out.println("creating order£º"+orderNumber);
	}

}
