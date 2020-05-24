package epam.training.flowerDelivery.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class OrderModel
{
	public OrderModel()
	{
	}

	public OrderModel(BigDecimal cost, String paymentStatus, String deliveryStatus)
	{
		this.cost = cost;
		this.deliveryStatus = deliveryStatus;
		this.paymentStatus = paymentStatus;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private BigDecimal cost;
	private String deliveryStatus;
	private String paymentStatus;

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
}
