/*packages contain group of classes, interface and method etc.
// type-Build-in package
user_defined package
driver class
 * program to demonstrate access specifier and instance operator
 */
package org.tnsif.firstpackage;

public class AssessExcutiver {

	public static void main(String[] args) {
		Base b=new Base();
		b.methoddefault();
		b.methodpublic();
		b.methodprotected();
		/*
		 * b.methodprivte does not access bcoz of private specifier
		 */
	
	System.out.println(b  instanceof Base );
		

	}

	}

