package com.java.core.Average;

public class Average {
	public int average (int maths , int science , int english){
		Addition a = new Addition();
		int total = a.addMarks(maths , science , english);
		int average  = total / 3;
		return average;
		
	}

}
