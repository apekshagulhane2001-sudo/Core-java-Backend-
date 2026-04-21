package com.java.coreTwoClass;

public class Test {
	public static void main(String[] args) {
		
		//Requirement -> fname = John, lname = wick, yob = 1999
		// Username -> Johnwick
		
		UsernameGenerator generator = new UsernameGenerator();
		
		String username = generator.getUsername("John", "wick", 1999);
		
		System.out.println("Username is : " + username);
	}

}
