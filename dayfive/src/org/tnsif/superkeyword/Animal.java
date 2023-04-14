package org.tnsif.superkeyword;
public class Animal {
	public  String animaltype ="Wild ";
	public int nooflegs = 2;
	public Animal() {
		System.out.println("Animal class constructor ");
	}
	public void display() {
		System.out.println("animal Type :-"+animaltype);
		System.out.println("Number of legs  :-"+nooflegs);
	}
	@Override
	public String toString() {
		return "Animal [animaltype=" + animaltype + ", nooflegs=" + nooflegs + "]";
	}
}