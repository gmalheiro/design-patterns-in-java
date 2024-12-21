package main.java;

import main.java.entity.User;

public class Main {

	public static void main(String[] args) {
		User user = new User.UserBuilder("Some", "Dude", "somedude@mail.com")
				.setAddress("Some street")
				.setAge(30)
				.setPhoneNumber("11 99999999")
				.build();
		
		User anonUser = new User.UserBuilder("John", "Wick", "jw@mail.com").build();
		
		System.out.println(user);
		System.out.println(anonUser);
		
	}

}
