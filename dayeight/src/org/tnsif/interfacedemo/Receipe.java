//functional interface 
package org.tnsif.interfacedemo;
//Exactly one abstract method
//Functional interface :- an interface which contin exactly one method

//Below annotation tells us that interface as one abstarct method
@FunctionalInterface
public interface Receipe {
	
	//by default all the method inside an interface are public abstact and variable are public static final 
	//abstract method 
	
	String displayname();
	//String print();
	

}
