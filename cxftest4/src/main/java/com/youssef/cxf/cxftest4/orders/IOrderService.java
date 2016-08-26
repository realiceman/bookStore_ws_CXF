package com.youssef.cxf.cxftest4.orders;

import com.youssef.schema.order.OrderInquiryResponseType;

public interface IOrderService {

	OrderInquiryResponseType processOrder(int uniqueOrderId, int orderQuantity, int accountId, long ean13);
	
}
