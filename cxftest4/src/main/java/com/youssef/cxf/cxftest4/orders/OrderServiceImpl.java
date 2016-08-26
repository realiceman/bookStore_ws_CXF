package com.youssef.cxf.cxftest4.orders;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

import com.youssef.schema.order.*;


@Service
public class OrderServiceImpl implements IOrderService {

	@Override
	public OrderInquiryResponseType processOrder(int uniqueOrderId, int orderQuantity, int accountId, long ean13) {
		//process the logic
		ObjectFactory factory = new ObjectFactory();
		OrderInquiryResponseType response = factory.createOrderInquiryResponseType();
		AccountType account = factory.createAccountType();
		account.setAccountId(accountId);
		response.setAccount(account);
		OrderItemType orderItem = factory.createOrderItemType();
		BookType book = factory.createBookType();
		book.setEan13(ean13);
		book.setTitle("cxf youssef book");
		orderItem.setBook(book);
		try {
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(new Date(System.currentTimeMillis()));
			XMLGregorianCalendar estimatedShippingDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			orderItem.setExpectedShippingDate(estimatedShippingDate);
			orderItem.setLineNumber(Integer.valueOf(1));
			orderItem.setPrice(new BigDecimal(5));
			orderItem.setQuantityShipped(orderQuantity);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		OrderType order =factory.createOrderType();
		order.setOrderStatus(OrderStatusType.READY);
		order.getOrderItems().add(orderItem);
		response.setOrder(order);
		return response;
	}

}
