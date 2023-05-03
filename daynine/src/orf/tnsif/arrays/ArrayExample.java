package orf.tnsif.arrays;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
	System.out.println("Enter the no of elements:");
	Scanner s=new Scanner(System.in);
	int num =s.nextInt();
	//array declaration
	int arr[] =new int[num];
	//aray initialization
	for(int itr:arr) {
		System.out.println("Array element are:"+itr+"");
	}

	}

}
