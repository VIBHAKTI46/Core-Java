//demonstrate program on String method
package org.tnsif.stringprogram;
import java.util.*;
public class StringMethodProgram {
	public static void main(String[] args) {
		// using String literal
		String str1="Dhoni";
		//using new String
		Scanner s=new Scanner(System.in);
		String str2=new String(s.nextLine());
		if(str1.equals(str2))
		{
			System.out.print(false);
		}
		

	}

}
