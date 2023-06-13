//program to  demonstrate on generic method
//can pass any kind of element at the same time
package org.tnsif.generics;
class GenericMethod{
	public <E> void print(E[] arr1)//E is element it can int, char, string
	{
		for(E itr:arr1 ) {
			System.out.print(itr+" ");
		}
		System.out.println();
	}
}
//driver class
public class GenericMethodExample {

	public static void main(String[] args) {
		GenericMethod g=new GenericMethod();
		Integer[] arr1= {11,22,33};
		Character[] arr2= {'f','d','g'};
		System.out.print("Interger array:");
		g.print(arr1);
		System.out.print("Character array:");
		g.print(arr2);
	}
	

	

}
