package groupCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import groupCourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
