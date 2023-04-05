//Program to Demonstrate on Compile on user input value
package org.tnsif.userinputdemo;
import java.util.Scanner;
public class userInputProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Salary:");
		//user-input
		float salary =s.nextFloat();
		System.out.println("Salary:"+salary);
		System.out.println("Enter your name: ");
		String name = s.next();
		System.out.println("name :" +name);
		s.nextLine();
		System.out.println("Enter your name1: ");
		String name1 = s.nextLine();
		System.out.println("name :" +name1);
		s.nextLine();
		char ch = s.next().charAt(0);
		System.out.println(ch);
		s.close();
		

	}

}
