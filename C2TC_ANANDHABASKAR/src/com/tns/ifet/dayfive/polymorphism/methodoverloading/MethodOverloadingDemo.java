package com.tns.ifet.dayfive.polymorphism.methodoverloading;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		System.out.println("------------------------ Method Overloading -----------------------");
		System.out.println("Addition of two integers : " + m.addition(10, 20));//Here object creation is not manidatory
		System.out.println("Addition of two floating numbers :" + MethodOverloading.addition(10.0f, 20.f));
		System.out.println("Addition of one integer and one float :" + MethodOverloading.addition(10, 20.0f));
		System.out.println("Addition of one float and one integer :" + MethodOverloading.addition(10.0f, 20));
		System.out.println("Addition of two Strings : " + MethodOverloading.addition("Hello ", "World"));
	}

}
