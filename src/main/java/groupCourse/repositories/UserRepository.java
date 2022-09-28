package groupCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import groupCourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
