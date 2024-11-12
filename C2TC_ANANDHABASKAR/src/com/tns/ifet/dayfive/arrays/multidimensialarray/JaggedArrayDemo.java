package com.tns.ifet.dayfive.arrays.multidimensialarray;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		int d[][] = { { 10, 20, 30 }, { 40 }, { 12, 21 }, { 11 } };

		System.out.println("Total Rows in Array d : " + d.length);

		MLArray.printArray(d);

	}

}


/*A Jagged Array (also known as an array of arrays) in Java is a multidimensional 
 * array where the inner arrays can have different lengths. 
 * This is unlike a typical 2D array where each row has the same number of columns.
 */