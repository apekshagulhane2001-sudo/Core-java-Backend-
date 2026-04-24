package com.java.core.conditionalstatement;
import java.util.Scanner;
public class DayFinderSwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter a number between 1 to 7");
		int input = sc.nextInt();
		
		switch (input) {
		case 1: {
			System.err.println("MONDAY");
			break;
		}
		case 2: {
			System.err.println("TUESDAY");
			break;
		}
		case 3: {
			System.err.println("WEDNESDAY");
			break;
		}
		case 4: {
			System.err.println("THURSDAY");
			break;
		}
		case 5: {
			System.err.println("FRIDAY");
			break;
		}
		case 6: {
			System.err.println("SATURDAY");
			break;
		}
		case 7: {
			System.err.println("SUNDAY");
			break;
		}
		default:
		{
			System.out.println("ENTER PROPER NUMBER");
		}
			
		}
		
	}

}
