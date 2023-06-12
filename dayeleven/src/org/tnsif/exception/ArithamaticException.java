package org.tnsif.exception;

import java.util.Scanner;

public class ArithamaticException {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a two number");
		int x =s.nextInt();
		int y =s.nextInt();
		//contain an exception code
		try {
		System.out.println(x/y);
		}
		//catch block handle exception
		catch(Exception e){
			System.out.println(e);
			
		}
		
		finally
		{
			System.out.println(" done with");
		}
	}

}