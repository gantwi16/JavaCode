package com.qa.calculator;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		User user1 = new User();
		user1.setForename("Adam");
		user1.setSurname("Clark");
		user1.setAge(20);
		user1.setTelephoneNo("07912345678");
		user1.setEmail("abc@gmail.com");
		user1.setMiddleNames(List.of("Brian"));
		System.out.println(user1.getAge());
		System.out.println(user1.getEmail());
		System.out.println(user1.getForename());
		System.out.println(user1.getSurname());
		System.out.println(user1.getTelephoneNo());
		System.out.println(user1.getMiddleNames());
		
		User user2 = new User();
		user2.setForename("Bob");
		user2.setSurname("Daniels");
		user2.setAge(21);
		user2.setTelephoneNo("02081234567");
		user2.setEmail("bcd@gmail.com");
		user2.setMiddleNames(List.of("Carl"));
		System.out.println(user2.getAge());
		System.out.println(user2.getEmail());
		System.out.println(user2.getForename());
		System.out.println(user2.getSurname());
		System.out.println(user2.getTelephoneNo());
		System.out.println(user2.getMiddleNames());
		
		User user3 = new User();
		user3.setForename("Ed");
		user3.setSurname("Greg");
		user3.setAge(22);
		user3.setTelephoneNo("0800001066");
		user3.setEmail("efg@gmail.com");
		user3.setMiddleNames(List.of("Fred"));
		System.out.println(user3.getAge());
		System.out.println(user3.getEmail());
		System.out.println(user3.getForename());
		System.out.println(user3.getSurname());
		System.out.println(user3.getTelephoneNo());
		System.out.println(user3.getMiddleNames());
		
		// DataType variableName = new DataType();
		List<User> users; // declaring a list of User
		users = new ArrayList<User>(); // initialising users with an Array List
		users.add(user3);
		users.add(user2);
		users.add(user1);
		for (User c : users) {
			System.out.println(c);
		}
	}
	
}


