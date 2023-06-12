//program on simple array
package orf.tnsif.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		//compile time array 
		int arr [] = {12,6,19,67};
		//if we access 4th index we will get exception 
		//as arrayindexoutofboundexception
		//System.out.println(arr[4]);
		
		System.out.println("Array of 2nd index :"+arr[2]);
		//for printing all the element arrayusing enhanced for loop
		for (int i :arr)
		{
			System.out.println(i+"");
		}
	}

}
