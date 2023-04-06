package org.tnsif.decisionmaking;
import java.util.Scanner;
public class SwitchCaseDemo {

	public static void main(String[] args) {
		System.out.println("Enter a choice ");
		Scanner s =new Scanner(System.in);
		int songinput =s.nextInt();
		switch(songinput)
		{
		case 1 :
			System.out.println("Calm down");
			break;
		case 2 :
			System.out.println("perfect ");
			break;
		case 3 :
			System.out.println("mallaon song ");
			break;
		default :
			System.out.println("invalid");
			
			
			
		}
		s.close();

	}

}
