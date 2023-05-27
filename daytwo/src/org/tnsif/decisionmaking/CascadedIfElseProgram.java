package org.tnsif.decisionmaking;
import java.util.Scanner;
public class CascadedIfElseProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the three value:");
		float per1=s.nextFloat();
		float per2=s.nextFloat();
		float per3=s.nextFloat();
		if(per1>=per2&&per1>=per3) {
			System.out.println("Person1 has highest percentage");
		}
		else if(per2>=per1&&per2>=per3) {
			System.out.println("Person2 has highest percentage");
		}
		else {
			System.out.println("Person3 has highest percentage");
		}
		
		
		

	}

}
