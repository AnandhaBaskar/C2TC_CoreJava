package com.tns.ifet.dayfive.arrays;
import java.util.Arrays;
public class ArrayClassDemo {

	public static void main(String[] args) {

		int intArr[] = { 10, 20, 15, 22, 35, 18 , 14 };

		System.out.println("Array is : "+Arrays.toString(intArr));
		System.out.println("Array is : "+ intArr);
		
		/*Output: Array is : [I@someHashCode
		This line prints a reference to the array ([I@someHashCode), not its contents.
		The [I indicates an integer array, and @someHashCode is the memory address of 
		the array in hexadecimal form.*/
		
		Arrays.sort(intArr);
		
		System.out.println("-----------------After Sorting---------------");
		System.out.println("Array is : "+Arrays.toString(intArr));

		int intKey = 22;

		// Print the key and corresponding index
		// Array must be sorted in ascending order for the binary search
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));

		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 2, 6, intKey));
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 2, 3, intKey));
//		Output: 22 found at index = -6
//		The result -6 indicates that 22 would be inserted at index 6 to maintain the sorted order if it were within the range.
		System.out.println("18 found at index = " + Arrays.binarySearch(intArr, 2, 3, 18));
//		Since 18 is not found, the result -4 indicates that 18 would be inserted at index 4 if it were within this limited range.
		System.out.println("35 found at index = " + Arrays.binarySearch(intArr, 2, 3, 35));
//		Since 35 is not found, the result -4 indicates that 35 would be inserted at index 4 if it were within this limited range.
		
/*		intKey: This is the integer value that we are looking for in the array intArr.

		intArr: This is an integer array where the search is performed.

		Arrays.binarySearch(intArr, 2, 6, intKey): This function performs a binary search on the specified range within the array. Here’s how it works:

		intArr: The array in which the search is done.
		2: The starting index (inclusive) of the range within intArr to search.
		6: The ending index (exclusive) of the range within intArr to search.
		intKey: The value to search for within intArr.
		The binary search is only performed within the elements from index 2 up to 6 in intArr (so indexes 2, 3, 4, 5 are included).

		Return Value:

		If intKey is found in the specified range, binarySearch returns the index of intKey within intArr.
		If intKey is not found, it returns a negative value, which indicates the insertion point where intKey could be added to keep the array sorted.*/

		
		
		System.out.println("First Array : " + Arrays.toString(intArr));
		
		//Get the second Array
		int intArr1[] = { 10, 15, 22 };
		System.out.println("Second Array : " + Arrays.toString(intArr1));

		// To compare both arrays
		if (Arrays.equals(intArr, intArr1))
			System.out.println("Both arrays are equal");
		else
			System.out.println("Arrays are not equal");

		//creates a new array with a specified length, 
		System.out.println("\nNew Arrays by copyOf:\n");
		int intArr2[]=Arrays.copyOf(intArr, 10);
		System.out.println("Integer Array: " + Arrays.toString(intArr2));

		System.out.println("\nNew Arrays by copyOfRange:");
		// To copy the array into an array of new length
		int intArr3[]=Arrays.copyOfRange(intArr, 1, 3);
		System.out.println("Integer Array: " + Arrays.toString(intArr3));

		// To fill the arrays with key 22
		Arrays.fill(intArr, intKey);
	
		System.out.println("Integer Array on filling 22: " + Arrays.toString(intArr));

	}

}

