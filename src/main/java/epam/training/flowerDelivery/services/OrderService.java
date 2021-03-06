package epam.training.flowerDelivery.services;

import java.math.BigDecimal;

import epam.training.flowerDelivery.exceptions.NoSuchCustomerException;
import epam.training.flowerDelivery.model.OrderModel;


public interface OrderService
{
	OrderModel saveOrder(BigDecimal cost, long customerId) throws NoSuchCustomerException;

	String getOrderDeliveryStatus(Long id);

	String getOrderPaymentStatus(Long id);

	String setOrderDeliveryStatus(Long id, String deliveryStatus);

	String setOrderPaymentStatus(Long id, String paymentStatus);
}
