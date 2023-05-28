package org.tnsif.secondpackage;
//import org.tnsif.firstpackage.*;
//way to import the another package
//import- package name-class name
import org.tnsif.firstpackage.Base;
public class Executor {

	public static void main(String[] args) {
		Base b =new Base();
		//if any method is deafult we cannot acess into another package
		//we can access only inside same package
		b.methodpublic();

		
	}

}