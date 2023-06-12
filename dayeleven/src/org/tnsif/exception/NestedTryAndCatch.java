
package org.tnsif.exception;

import java.util.Scanner;

public class NestedTryAndCatch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value of x and y");
		int x=s.nextInt()	;
		int y=s.nextInt();
		int arr[] =new int[] {11,22,33};
		
		try
		{
			try
			{
				System.out.println(arr[3]);
			}
			catch (ArrayIndexOutOfBoundsException e)
			 {
				 System.out.println("exception handle "+e);
			 }
			
		
		try
		{
			System.out.println(x/y);
		}
		 catch (ArithmeticException e) {
			 System.out.println("exception handle "+e);
			 
		 }
		}
		finally
		{
			System.out.println("finally block");
		}
		
				
				
				
	}

}