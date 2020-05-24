package epam.training.flowerDelivery.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class OrderModel
{
	public OrderModel()
	{
	}

	public OrderModel(BigDecimal cost, String paymentStatus, String deliveryStatus, CustomerModel customerModel)
	{
		this.cost = cost;
		this.deliveryStatus = deliveryStatus;
		this.paymentStatus = paymentStatus;
		this.customerModel = customerModel;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private BigDecimal cost;
	private String deliveryStatus;
	private String paymentStatus;

	@ManyToOne
	@JoinColumn(name = "customerId", nullable = false)
	private CustomerModel customerModel;

	public Long getOrderId()
	{
		return id;
	}

	public void setOrderId(Long orderId)
	{
		this.id = orderId;
	}

	public BigDecimal getCost()
	{
		return cost;
	}

	public void setCost(BigDecimal cost)
	{
		this.cost = cost;
	}

	public String getPaymentStatus()
	{
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus)
	{
		this.paymentStatus = paymentStatus;
	}

	public String getDeliveryStatus()
	{
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus)
	{
		this.deliveryStatus = deliveryStatus;
	}

	public CustomerModel getCustomerModel()
	{
		return customerModel;
	}

	public void setCustomerModel(CustomerModel customerModel)
	{
		this.customerModel = customerModel;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}
}
