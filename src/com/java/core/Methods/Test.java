package com.java.core.Methods;

public class Test {
	public static void main(String[] args) {
		Methods m = new Methods();
		m.MultiplyVoid();
		
		m.multiplyVoidParam(100 , 3);
		
		int ans = m.multiplyReturn();
	System.out.println("Answer using return type is :" +ans);		
		
		int multip = m.MultiplyReturnPara(34 , 10);
		System.out.println("Answer using return type - parameterised is :" +multip);

	}

}
