package epam.training.flowerDelivery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import epam.training.flowerDelivery.services.OrderService;


@RestController
@RequestMapping("/delivery")
public class DeliveryController
{

	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/getStatus/{orderId}")
	public String getOrderDeliveryStatus(@PathVariable("orderId") long orderId)
	{
		String deliveryStatus = orderService.getOrderDeliveryStatus(orderId);
		return "Order with id: " + orderId + " is " + deliveryStatus;
	}

	@RequestMapping(value = "/setStatus/{orderId}/{deliveryStatus}")
	public String setOrderDeliveryStatus(@PathVariable("orderId") long orderId, @PathVariable("deliveryStatus") String deliveryStatus)
	{
		return orderService.setOrderDeliveryStatus(orderId, deliveryStatus);
	}

}
