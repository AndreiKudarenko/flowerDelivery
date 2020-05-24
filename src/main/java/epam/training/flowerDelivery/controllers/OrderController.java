package epam.training.flowerDelivery.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import epam.training.flowerDelivery.exceptions.NoSuchCustomerException;
import epam.training.flowerDelivery.model.OrderModel;
import epam.training.flowerDelivery.services.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController
{

	@Autowired
	OrderService orderService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createOrder(@RequestParam double cost, @RequestParam long customerId)
	{
		try
		{
			OrderModel order = orderService.saveOrder(BigDecimal.valueOf(cost), customerId);
			return "Order created with id:" + order.getOrderId();
		}
		catch (NoSuchCustomerException e)
		{
			return e.getMessage();
		}
	}

}
