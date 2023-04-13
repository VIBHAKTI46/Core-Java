package org.tnsif.function;
import java.util.Scanner;
public class AddTwoNumbers {
	public static int add1(int a,int b) {
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a two number");
		int a=s.nextInt();
		int b=s.nextInt();
		AddTwoNumbers ab=new AddTwoNumbers();
		System.out.print("Addition is "+ab.add1(a, b));
        s.close();
	}

}
