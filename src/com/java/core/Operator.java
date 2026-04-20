package com.java.core;

public class Operator {
	public static void main(String[] args) {
		int a = 20;
		int b = 6;
		
		//add, substraction, multiplication, division and mod
		//20+5 = 25 (whole number)-> a & b is int so sum is also int
		
		//addition
		int sum = a+b;
		System.out.println(sum);
		
		//substraction
		
		int subs = a-b;
		System.out.println(subs);
		
		//Multiplication
		
		int mul = a*b;
		System.out.println(mul);
		
		//Division a = 20 and b = 6 ->20/6 = 3 (quotient)
		
		int division = a/b;
		System.out.println(division);
		
		//Mod operator
		  int rem = a%b;
		  System.out.println(rem);
				
	}

}
