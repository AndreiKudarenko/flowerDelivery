package epam.training.flowerDelivery.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import epam.training.flowerDelivery.model.OrderModel;
import epam.training.flowerDelivery.services.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController
{

	@Autowired
	OrderService orderService;

	@RequestMapping("/create")
	public String createOrder()
	{
		OrderModel order = orderService.saveOrder(BigDecimal.valueOf(100), "not delivered", "not paid");
		return "Order created with id:" + order.getOrderId();
	}

}
