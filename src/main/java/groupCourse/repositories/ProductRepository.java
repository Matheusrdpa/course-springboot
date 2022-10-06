package groupCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import groupCourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
