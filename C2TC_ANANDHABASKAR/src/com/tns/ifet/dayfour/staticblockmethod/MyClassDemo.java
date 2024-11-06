package com.tns.ifet.dayfour.staticblockmethod;

public class MyClassDemo {
	static {
		System.out.println("Main Static block");
	}

	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		System.out.println(o1);
		MyClass.display();
		MyClass o2 = new MyClass();
		System.out.println(o2);
		MyClass.display();
		MyClass o3 = new MyClass();
		System.out.println(o3);
		MyClass.display();
		//try with make all line as comment

	}

}
