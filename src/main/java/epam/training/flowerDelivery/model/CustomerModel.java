package epam.training.flowerDelivery.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Customer")
public class CustomerModel
{
	public CustomerModel()
	{
	}

	public CustomerModel(String firstName, String secondName, int age)
	{
		FirstName = firstName;
		SecondName = secondName;
		this.age = age;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long customerId;
	private String FirstName;
	private String SecondName;
	private int age;
	@OneToMany
	private OrderModel orderModel;

	public Long getCustomerId()
	{
		return customerId;
	}

	public void setCustomerId(Long customerId)
	{
		this.customerId = customerId;
	}

	public String getFirstName()
	{
		return FirstName;
	}

	public void setFirstName(String firstName)
	{
		FirstName = firstName;
	}

	public String getSecondName()
	{
		return SecondName;
	}

	public void setSecondName(String secondName)
	{
		SecondName = secondName;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public OrderModel getOrderModel()
	{
		return orderModel;
	}

	public void setOrderModel(OrderModel orderModel)
	{
		this.orderModel = orderModel;
	}
}
