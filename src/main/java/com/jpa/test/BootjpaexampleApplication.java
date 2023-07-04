package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.jpa.test.dao.UserRepository;
import com.jpa.test.entites.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepo = context.getBean(UserRepository.class);
		User user=new User();
		
//		//add
//		user.setName("ekta zade");
//		user.setCity("nagpur");
//		User user1 = userRepo.save(user);
//		System.out.println(user1);
//		
//		//update
//		Optional<User> optional = userRepo.findById(2);
//		User user2 = optional.get();
//		user2.setName("avijeet patil");
//		User result  = userRepo.save(user2);
//		System.out.println(result);
		
		//show all data
//			Iterable<User> ite = userRepo.findAll();
//			ite.forEach(e->{System.out.println(e);});
//		Iterator<User> iterator = ite.iterator();
//		while(iterator.hasNext())
//		{
//			User next = iterator.next();
//			System.out.println(next);
//		}
		
//		
		//delete
		//userRepo.deleteById(2);
		
		//Custom method
//		List<User> user3 = userRepo.findByNameAndCity("ekta zade","nagpur");
//		user3.forEach(e->System.out.println(e));
		
		
	}

}
