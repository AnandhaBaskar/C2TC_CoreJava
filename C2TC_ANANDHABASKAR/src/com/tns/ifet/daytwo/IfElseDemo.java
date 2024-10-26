package com.tns.ifet.daytwo;
import java.util.*;
public class IfElseDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age :");
		int age=sc.nextInt();
		if(age>=18)
			System.out.println(" You are eligible for Voting");
		else
			System.out.println("Sorry! You need to wait more");
		System.out.println("if else demonstration");

	}

}
