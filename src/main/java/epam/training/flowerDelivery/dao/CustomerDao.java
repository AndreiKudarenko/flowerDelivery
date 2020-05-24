package epam.training.flowerDelivery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import epam.training.flowerDelivery.model.CustomerModel;


@Repository
public interface CustomerDao extends JpaRepository<CustomerModel, Long>
{
}
