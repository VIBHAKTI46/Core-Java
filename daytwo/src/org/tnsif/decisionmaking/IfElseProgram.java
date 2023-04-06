//program to demonstrate on if-else condition
package org.tnsif.decisionmaking;
import java.util.Scanner;
public class IfElseProgram {

	public static void main(String[] args) {
		/*
		 * if we have two condition to decide then
		 */
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the age and weight of a"+"Donor");
        int age=s.nextInt();
        int weight= s.nextInt();
        if(age>18&&weight>50)
        {
        	System.out.println("eligible to donate the blood");

        }
        else {
        	System.out.println(" not eligible to donate the blood");

        }
	}

}
