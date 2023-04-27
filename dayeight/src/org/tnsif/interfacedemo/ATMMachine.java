//Program to Demonstrate on interface
package org.tnsif.interfacedemo;
public interface ATMMachine {
	int amount=10000;
	/*all variable inside in interface are by default 
	public static  final,
	so, here amt is final type and it must be initialize
	
	
/* by default all method inside an interface are abstract
 */
	void withdraw();
	void deposit();
	
 
}
