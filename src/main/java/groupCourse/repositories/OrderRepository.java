package groupCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import groupCourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
