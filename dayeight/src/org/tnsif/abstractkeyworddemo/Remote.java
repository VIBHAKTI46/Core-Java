//program to demonstrate on abstract class and abstract method
package org.tnsif.abstractkeyworddemo;
/* if any class contain atleast one abstract  method then that class 
 * must be declare an abstract class*/
 
public abstract class Remote {
	public String  cellName;
	//abstract method
	abstract void functionRemote();
	//concrete method
	public void  display() {
		System.out.print("cell name is :"+cellName);
	}
 

}
//
class RemoteChild extends Remote
{
	void functionRemote() {
		System.out.println("Abstract method is implemented");
	}
}
