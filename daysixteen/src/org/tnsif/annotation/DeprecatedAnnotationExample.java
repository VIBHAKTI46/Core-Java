package org.tnsif.annotation;

public class DeprecatedAnnotationExample {
//it allows any elements no longer to be used
	@Deprecated
	public void print() {
		System.out.print("welcome to java Annotation");
	}
	public static void main(String[] args) {
		DeprecatedAnnotationExample d=new DeprecatedAnnotationExample();
		d.print();

	}

}
