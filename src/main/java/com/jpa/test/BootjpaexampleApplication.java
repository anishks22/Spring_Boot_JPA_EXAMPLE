package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository =context.getBean(UserRepository.class);
		
		User user1=new User();
		user1.setName("Anish kumar");
		user1.setCity("Patna");
		user1.setStatus("I am java Programmer");
		
		User user2=new User();
		user2.setName("Rohit kumar");
		user2.setCity("nawada");
		user2.setStatus("I am javascript Programmer");
		
//		User user3=userRepository.save(user1);
//		System.out.println(user3);
		
		//Save multiple object
//		List<User> allusers = List.of(user1,user2);
//		Iterable<User> result =userRepository.saveAll(allusers);
//		result.forEach(user-> {
//			System.out.println(user);
//		});
		
		//Update the user of id 5
//		Optional<User> optional = userRepository.findById(5);
//		User user=optional.get();
//		user.setName("Anish kumar sharma");
//		User result=userRepository.save(user);
//		System.out.println(result);
		
		//How to get the data
//		Iterable<User> itr =userRepository.findAll();
//		itr.forEach(user-> {
//			System.out.println(user);
//		});
		
		// get single data
//		Optional<User> optional = userRepository.findById(5);
//		System.out.println(optional);
		
		//Delete the data
		userRepository.deleteById(6);
		System.out.println("Deleted");
		
		
		
	}

}
