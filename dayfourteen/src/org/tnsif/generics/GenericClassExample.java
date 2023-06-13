//program to demonstrate
package org.tnsif.generics;
//generic class
class GenericClass<T>{

	T x;
	void print(T x) {
		this.x=x;
	}
	T accept() {
		return x;
	}
}
//driver class

	public class GenericClassExample<T> {
public static void main(String args[]) {
	GenericClass<Character>obj=new GenericClass<>();
	obj.print('S');
	System.out.print(obj.accept());
	/*GenericClass<String>obj=new GenericClass<>();
	obj.print('vibhakti');
	System.out.print(obj.accept());
	*/
	
}
}
