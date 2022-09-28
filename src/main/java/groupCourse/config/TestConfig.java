package groupCourse.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import groupCourse.entities.User;
import groupCourse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "Maria@gmail.com", "900000000", "123456");
		User u2 = new User(null, "Alex green", "alex@gmail.com", "91111111", "123456");
	
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
}
