package org.tnsif.exception;

public class multipleCatch {

	public static void main(String[] args) {
		int arr[] =new int[] {11,22,33};
		 System.out.println("Array is:");
		 try
		 {
			 System.out.println(arr[3]);
		 }
		 //we use multiple catch block 
		 /*catch (ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("exception handle "+e);
		 }
		 catch (ArithmeticException e) {
			 System.out.println("exception handle "+e);
			 
		 }*/
		 //mutiple exception in one catch
		 catch(ArrayIndexOutOfBoundsException | ArithmeticException  e)
		 {
			 System.out.println(e);
		 }

	}

}