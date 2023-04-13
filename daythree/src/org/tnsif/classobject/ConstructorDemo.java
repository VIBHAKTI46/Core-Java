// demonstrate class and object 
//driver class
package org.tnsif.classobject;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int id ;
		String city,name ;
		System.out.println("Enter the customer id :");
		id=s.nextInt();
		//to read next line
		s.nextLine();
		
		System.out.println("Enter the customer name :");
		name=s.nextLine();
		
		
		System.out.println("Enter the customer city :");
		city=s.nextLine();
		
		
		//object creation 
		//default constructor 
		Customer c =new Customer ();
		c.setCunstomerid(id);
		c.setCity(city);
		c.setCustomername(name);
		System.out.println(c);
		
		System.out.println("Enter the customer id :");
		id=s.nextInt();
		//to read next line
		s.nextLine();
		
		System.out.println("Enter the customer name :");
		name=s.nextLine();
		
		
		System.out.println("Enter the customer city :");
		city=s.nextLine();
		//parametrize constructor
		Customer c1 =new Customer (id,name,city);
		
		System.out.println(c1);
		s.close();

	}

}