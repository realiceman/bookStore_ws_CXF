package com.youssef.cxf.cxftest4.orders;

import static org.junit.Assert.*;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.youssef.schema.order.ObjectFactory;
import com.youssef.schema.order.OrderInquiryResponseType;
import com.youssef.schema.order.OrderInquiryType;
import com.youssef.service.orders.Orders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:test-beans.xml"})
public class DefaultOrdersEndpointTest {
	
	private Orders ordersService;
	private OrderInquiryType orderInquiryType;
	
	@Autowired
	private JaxWsProxyFactoryBean testOrdersClient;

	@Before
	public void setUp() throws Exception {
		ordersService = testOrdersClient.create(Orders.class);
		ObjectFactory factory = new ObjectFactory();
		orderInquiryType = factory.createOrderInquiryType();
		orderInquiryType.setAccountId(999);
		orderInquiryType.setEan13(1234567890123L);
		orderInquiryType.setOrderQuantity(4);
		orderInquiryType.setUniqueOrderId(12345);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProcessOrderPlacementSuccess() {
		OrderInquiryResponseType response = ordersService.processOrderPlacement(orderInquiryType);
		assertTrue(response.getAccount().getAccountId() == 999);
		
	}

}
