package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjapaexampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=SpringApplication.run(BootjapaexampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("Durgesh kumar tiwari");
		user.setCity("Delhi");
		user.setStatus("Iam Java Progrmmer");
		
		User user1 = userRepository.save(user);
		
		System.out.println(user1);
		
		//Create object of user
		User user1=new User();
		user1.setName("Uttam");
		user1.setCity("City1");
		user1.setStatus("Python Programmer");
				
	}

}
