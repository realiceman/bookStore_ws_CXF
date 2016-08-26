package com.youssef.cxf.cxftest4.orders;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.youssef.schema.order.AccountType;
import com.youssef.schema.order.ObjectFactory;
import com.youssef.schema.order.OrderInquiryResponseType;
import com.youssef.schema.order.OrderInquiryType;
import com.youssef.service.orders.Orders;

@WebService(portName="OrderSOAP", serviceName="Orders", endpointInterface="com.youssef.service.orders.Orders",
targetNamespace="http://www.youssef.com/service/Orders/")
public class DefaultOrdersEndpoint implements Orders {

	@Autowired
	private IOrderService orderService;
	
	
	@Override
	public OrderInquiryResponseType processOrderPlacement(
			OrderInquiryType orderInquiry) {
		
		OrderInquiryResponseType response =  orderService.processOrder(orderInquiry.getUniqueOrderId(), orderInquiry.getOrderQuantity(),
				                                                        orderInquiry.getAccountId(), orderInquiry.getEan13());
		
		
//		ObjectFactory factory = new ObjectFactory();
//		OrderInquiryResponseType response = factory.createOrderInquiryResponseType();
//		AccountType account = factory.createAccountType();
//		account.setAccountId(1);
//		response.setAccount(account);
		return response;
	}

}
