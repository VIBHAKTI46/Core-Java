package org.tnsif.customexeption;

import java.util.Scanner;

public class CustomExceptionExample {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String id =s.nextLine();
		String password =s.nextLine();
		try {
		if(id.equals("vibhaktipatil521@gmail.com") && password.equals("1234"))
		{
			
			System.out.println("login sucessfull");
		}
		else
		{
			throw new LoginCredential("Invalid Creditional");
		}
		
		}
	//Handling using ud exception
	
	catch (LoginCredential e)
	{
		System.out.println("Exception handled"+e);
		
	}
		
}
}
