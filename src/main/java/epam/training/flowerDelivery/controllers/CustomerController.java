package epam.training.flowerDelivery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import epam.training.flowerDelivery.model.CustomerModel;
import epam.training.flowerDelivery.services.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController
{

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/registry", method = RequestMethod.POST)
	public CustomerModel registryNewCustomer(@RequestParam String firstName, @RequestParam String secondName, @RequestParam int age)
	{
		return customerService.createCustomer(firstName, secondName, age);
	}
}
