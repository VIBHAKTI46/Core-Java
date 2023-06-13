package org.tnsif.annotation;
//parent class
 class Car {
	public void speead(int speed) {
		System.out.println("Speead is:"+speed+"km/hr");
	}
//child class
	// child class is inheritenting the properties of parent class
	class Lamborghini extends Car{
		public void speed(int speed) {
			System.out.println("Speead is:"+speed+"km/hr");
		}
	}
	public class OverridingAnnotationExample{
	public void main(String[] args) {
		Lamborghini l=new Lamborghini();
		l.speed(80);
	}
	}

}
