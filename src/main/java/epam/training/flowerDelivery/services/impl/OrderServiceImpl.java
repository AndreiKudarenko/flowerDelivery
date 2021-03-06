package epam.training.flowerDelivery.services.impl;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import epam.training.flowerDelivery.dao.CustomerDao;
import epam.training.flowerDelivery.dao.OrderDao;
import epam.training.flowerDelivery.exceptions.NoSuchCustomerException;
import epam.training.flowerDelivery.model.CustomerModel;
import epam.training.flowerDelivery.model.OrderModel;
import epam.training.flowerDelivery.services.OrderService;


@Service
public class OrderServiceImpl implements OrderService
{
	@Autowired
	OrderDao orderDao;
	@Autowired
	CustomerDao customerDao;

	@Override
	public OrderModel saveOrder(BigDecimal cost, long customerId)
			throws NoSuchCustomerException
	{
		Optional<CustomerModel> customerModel = customerDao.findById(customerId);
		if(customerModel.isPresent())
		{
			OrderModel orderModel = new OrderModel(cost, "not delivered", "not paid", customerModel.get());
			return orderDao.save(orderModel);
		}
		throw new NoSuchCustomerException("There is no customer with id: " + customerId);
	}

	@Override
	public String getOrderDeliveryStatus(Long id)
	{
		Optional<OrderModel> orderModel = orderDao.findById(id);
		if(orderModel.isPresent())
		{
			return orderModel.get().getDeliveryStatus();
		}
		return "not found";
	}

	@Override
	public String getOrderPaymentStatus(Long id)
	{
		Optional<OrderModel> orderModel = orderDao.findById(id);
		if(orderModel.isPresent())
		{
			return orderModel.get().getPaymentStatus();
		}
		return "not found";
	}

	@Override
	public String setOrderPaymentStatus(Long id, String paymentStatus)
	{
		Optional<OrderModel> orderModel = orderDao.findById(id);
		if(orderModel.isPresent())
		{
			orderModel.get().setPaymentStatus(paymentStatus);
			return paymentStatus;
		}
		return "not found";
	}

	@Override
	public String setOrderDeliveryStatus(Long id, String deliveryStatus)
	{
		Optional<OrderModel> orderModel = orderDao.findById(id);
		if(orderModel.isPresent())
		{
			orderModel.get().setDeliveryStatus(deliveryStatus);
			return deliveryStatus;
		}
		return "not found";
	}
}
