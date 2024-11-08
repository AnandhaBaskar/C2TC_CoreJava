package com.tns.ifet.dayfive.polymorphism.constructoroverloading;

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		Adder p = new Adder(); 
		System.out.println(p);

		Adder p1 = new Adder(14.5f); 
		System.out.println(p1);

		Adder p2 = new Adder(12.5f, 20.50f); 
		System.out.println(p2);
		
		p2 = new Adder(15.5f, 25.50f); 
		System.out.println(p2);
	
//		Adder p2 = new Adder(15.5f, 25.50f); 
//		System.out.println(p2);
		
		Adder p3 = new Adder(5, 20); 
		System.out.println(p3);

	}

}
