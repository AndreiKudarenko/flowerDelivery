package epam.training.flowerDelivery.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/checkout")
public class CheckoutController
{

	@RequestMapping("/deliveryTime/{timeInterval}")
	public String chooseDeliveryTime(@RequestParam("intervalNumber") int intervalNumber)
	{
		return "";
	}

	@RequestMapping("/paymentMethod/{paymentMethod}")
	public String choosePaymentMethod(@RequestParam("paymentMethodNumber") int paymentMethodNumber)
	{
		return "";
	}

}
