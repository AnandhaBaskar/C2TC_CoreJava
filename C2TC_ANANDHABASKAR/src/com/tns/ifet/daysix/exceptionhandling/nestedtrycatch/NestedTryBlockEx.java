package com.tns.ifet.daysix.exceptionhandling.nestedtrycatch;
import java.util.*;
public class NestedTryBlockEx {
	public static int divide(int x, int y) {
		int z = 0;
		z = x / y;
		System.out.println("Result of division is z: " + z);
		return z;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x, y,z;
		try {
			System.out.println("Enter the value for x :");
			x=sc.nextInt();
			System.out.println("Enter the value for y :");
			y=sc.nextInt();
//			x = Integer.parseInt(args[0]); // command line args
//			y = Integer.parseInt(args[1]);
			try
			{
				z=divide(x, y);
			} 
			catch (ArithmeticException ae)
			{
				System.err.println("Error! A number cannot be divided by 0");
			}
		   } 
		catch (Exception e)
		{
			System.err.println("Error! Invalid input, number must be an integer.");
		} 
//		catch (ArrayIndexOutOfBoundsException e)
//		{
//			System.err.println("Error! please pass numbers ");
//		}
		System.out.println("I am out of outer catch block");
	}

}
