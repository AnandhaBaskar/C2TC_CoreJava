package com.tns.ifet.daythree.scannerdemo;


import java.util.*;
public class PersonDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter Person Name : ");
		name=sc.nextLine();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		System.out.println("Enter gender: ");
		String gender=sc.next();
		System.out.println("Enter taxable income:");
		int income = sc.nextInt();

		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);

		System.out.println(person);
		TaxCalculation calc=new TaxCalculation();
		calc.calculateTax(person); 
	
	    System.out.println("After calculating tax : ");
		System.out.println(person);
		sc.close();
		}

}
