package com.java.core.LoopsClassWork;
import java.util.Scanner;
public class Example3 {
	
	//addition using scanner
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			// while used kela ni double run kraychi grj nhi
			System.out.println("please enter a name : ");
			String name = sc.next();
			System.out.println("Entered name is : " + name);
		}
			
		
	}
	

}
