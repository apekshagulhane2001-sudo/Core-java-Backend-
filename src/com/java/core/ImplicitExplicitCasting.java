package com.java.core;

public class ImplicitExplicitCasting {
	public static void main(String[] args) {
	//casting -> conversion of one datatype
			// implicit casting -> Conversion from small datatypes to large datatype
	        // automatic type casting

			int a = 23;
			double d = a;
			System.out.println("Valve of d:" +d);
			
			//explicit casting -> Conversion from large to small datatype
	        //Manual type casting  //explicit casting madhe data lost che chances aahe
	        // jya madhe convert kraycha aahe tya te datatype takaycha
			double b = 94.23;
			int z = (int) b;
			System.out.println("value of z is :" +z);
	}

}
