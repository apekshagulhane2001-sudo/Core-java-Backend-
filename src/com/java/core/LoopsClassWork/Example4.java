package com.java.core.LoopsClassWork;
import java.util.Scanner;
	
public class Example4 {

	public static void main(String[] args) {
/* addition using scanner
 * 
 */
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("please enter a ->");
			int a = sc.nextInt();
			System.out.println("please enter b ->");
			int b = sc.nextInt();
			
			int sum = a+b;
			System.out.println("Adition is : " +sum);
			System.err.println("=============");
			
		}
	}

}
