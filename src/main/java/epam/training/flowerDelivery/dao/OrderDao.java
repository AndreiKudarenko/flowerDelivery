package epam.training.flowerDelivery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import epam.training.flowerDelivery.model.OrderModel;

@Repository
public interface OrderDao extends JpaRepository<OrderModel, Long>
{
}
