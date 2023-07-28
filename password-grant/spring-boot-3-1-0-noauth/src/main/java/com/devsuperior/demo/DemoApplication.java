package com.devsuperior.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	/* //teste do spring security
	@Autowired
	private PasswordEncoder passwordEncoder;
	*/

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/* //teste do spring security
	@Override
	public void run(String... args) throws Exception {
		System.out.println("ENCODE = " + passwordEncoder.encode("123456"));
		boolean result = passwordEncoder.matches("123456", "$2a$10$7t2BUsRE95b9RbLejb4kRO7KFEIi.oqAHJxKftPqNRPsUttNYHXHW");
		System.out.println("Resultado = " + result);
	}
	*/
}
