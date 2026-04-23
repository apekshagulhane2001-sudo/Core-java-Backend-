package com.java.core.Methods;

public class Methods {
	// multiplication 
		//void
		//non paramaterised -> because circle braket madhe kahi nhi aahe()
		public void MultiplyVoid(){
			int a = 2;
			int b = 23;
			int mul = a *b ;
			System.out.println("Multiplication using void is : " +mul);
			
				
		}
		
		
			// void method with paramaterized
			//paramaterized method -> method with parameter in parenthesis
		public void multiplyVoidParam(int a , int b){
			int mul = a * b;
			System.out.println("Multiplication using void and param is : " +mul);
			
	}		
		// ==================================================================
		//return type method
		//int return type non paramaterized
		public int multiplyReturn(){
			int a = 3;
			int b = 10;
			int mul = a *b ;
			return mul;
				
			
		}
		//int return type paramaterized
		//public int MultiplyReturnPara()
		public int MultiplyReturnPara(int a , int b){
			int mul = a*b;
			return mul;
		}

}
