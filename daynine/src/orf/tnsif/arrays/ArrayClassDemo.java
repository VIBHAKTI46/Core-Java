package orf.tnsif.arrays;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		//array initialization
		int array[]= {12,67,54,90,87};
		//using arrays class, we print  all array elements
		System.out.print(Arrays.toString(array));
        //sorting
		Arrays.sort(array);
		System.out.print(Arrays.toString(array));
	}

}
