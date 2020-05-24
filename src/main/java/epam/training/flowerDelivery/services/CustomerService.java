package epam.training.flowerDelivery.services;

import epam.training.flowerDelivery.model.CustomerModel;


public interface CustomerService
{
	public CustomerModel createCustomer(String firstName, String secondName, int age);
}
