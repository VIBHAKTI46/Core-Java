package org.tnsif.objectclassdemo;
class Sample {
		
	}
	class Demo {
		//constructor
		Demo(){
			System.out.println("Inside COnstructor");
		}
		protected void finalize() {
			
	}
	public class ObjectClassDemo {
	public  void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		
		Demo d=new Demo();
		System.out.println(d.getClass());
		System.out.println(d.hashCode());
		Object obj=new Object();
		
		
	}
	}

}
