package org.tnsif.looping;
import java.util.Scanner;
public class WhileLoop {
//if we don't know how many time any condition will execute in such case use while loop
	/*
	 * Syntax
	 * while(condition){
	 *body;
	 *i++;
	 *}
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(i+"");
			i++;
		}
		sc.close();

	}

}
