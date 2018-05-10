package com.sl.aop;

import org.junit.Test;

public class AopTest {

	@Test
	public void Testdynamicproxy() {

		OrderServiceImpl serviceImpl = new OrderServiceImpl();
		OrderLogger logger = new OrderLogger();
		OrderService service = (OrderService) new ServiceProxy(serviceImpl, logger).GetDynamicProxy();
		service.createOrder();
	}

}
