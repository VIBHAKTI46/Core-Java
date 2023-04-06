package org.tnsif.decisionmaking;
import java.util.Scanner;
public class nestedIfDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		if(num>0)
		{
			if (num<0)
			{
				System.out.println("Non -Zero number");
			}
			else
			{
				System.out.println("Zero/non-zero number");
			}
		}
		else
		{
			System.out.println("Either Non -Zero/zero  number");
		}
		
		s.close();

	}

}
