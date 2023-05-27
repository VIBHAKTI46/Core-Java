//Program to Demonstrate on pre & Post increment and Decrement
package org.tnsif.operatordemo;

public class IncrementDecrement {

	public static void main(String[] args) {
	int a=12,b=5;
	int x=a++;//12
	++a;//++13//14
	
	int y=b--;//4--
	--b;//4
	System.out.println(a);//14
	System.out.println(x);//12
	System.out.println(y);//4
	System.out.println(b);//3
	}

}
