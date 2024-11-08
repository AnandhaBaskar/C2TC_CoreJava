package com.tns.ifet.dayfive.arrays.multidimensialarray;

import java.util.Scanner;

public class MultiDimArrayDemo {

	public static void main(String[] args) {
		int c[][] = { { 12, 45 }, { 10, 40 }, { 5, 7 } };

		System.out.println("No. of Rows in C array : " + c.length);

		MLArray.printArray(c);
		
//		object
		for(int[] a:c)
			System.out.println(a);
		
		
		for (int[] row : c) { 
		    for (int element : row) { 
		        System.out.print(element + " ");
		    }
		    System.out.println(); 
		}	
	}

}
