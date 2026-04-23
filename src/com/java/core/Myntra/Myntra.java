package com.java.core.Myntra;

public class Myntra {
	public static void main(String[] args) {
		//Object
        Men m = new Men();
	System.out.println("Men shirt details are:");
	System.out.println(m.brandName);
	System.out.println(m.price);
	System.out.println(m.colour);
	System.out.println(m.size);
	
	//Object
	Women w = new Women();
	System.out.println("Women saree details are:");
	System.out.println(w.brandName);
	System.out.println(w.cost);
	System.out.println(w.colour);
	}

}
