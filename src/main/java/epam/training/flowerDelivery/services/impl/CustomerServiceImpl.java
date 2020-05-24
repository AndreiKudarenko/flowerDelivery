package epam.training.flowerDelivery.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import epam.training.flowerDelivery.dao.CustomerDao;
import epam.training.flowerDelivery.model.CustomerModel;
import epam.training.flowerDelivery.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService
{

	@Autowired
	CustomerDao customerDao;

	@Override
	public CustomerModel createCustomer(String firstName, String secondName, int age)
	{
		if(age < 18) {
			throw new IllegalArgumentException("customer should be 18+");
		}
		CustomerModel customer = new CustomerModel(firstName, secondName, age);
		return customerDao.save(customer);
	}
}
