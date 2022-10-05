package groupCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import groupCourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
