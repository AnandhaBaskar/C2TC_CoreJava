package com.tns.ifet.daytwo;

import java.util.Scanner;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a :");
		a=sc.nextInt();
		System.out.print("Enter the value of b :");
		b=sc.nextInt();
		System.out.print("Enter the value of c :");
		c=sc.nextInt();
		System.out.println("The largest number is");
		if (a>b)
		{
			if (a>c)
				System.out.print(a);
			else
				System.out.print(c);
		}
		else
		{
			if (c>b)
				System.out.print(c);
			else
				System.out.print(b);
		}
	}

}
