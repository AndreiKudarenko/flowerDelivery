package epam.training.flowerDelivery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import epam.training.flowerDelivery.services.OrderService;


@RestController
@RequestMapping("/payment")
public class PaymentController
{

	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/getStatus/{orderId}")
	public String getOrderPaymentStatus(@PathVariable("orderId") long orderId)
	{
		String paymentStatus = orderService.getOrderPaymentStatus(orderId);
		return "Order with id: " + orderId + " is " + paymentStatus;
	}

	@RequestMapping(value = "/setStatus/{orderId}/{paymentStatus}")
	public String setOrderPaymentStatus(@PathVariable("orderId") long orderId, @PathVariable("paymentStatus") String paymentStatus)
	{
		return orderService.setOrderPaymentStatus(orderId, paymentStatus);
	}
}
