package org.tnsif.superkeyword;

public class Tiger extends Animal {
	
	public  String animaltype = "  Tiger- wild ";
	public  int nooflegs = 4;
	
	
	
	public Tiger() {
	//super();
		System.out.println("Tiger class constructor child  ");
	}



	public void display() {
		super.display();
		System.out.println(super.animaltype);
		System.out.println(super.nooflegs);
		System.out.println("animal Type:- "+animaltype);
		System.out.println("Number of legs:- "+nooflegs);
	}

	

	@Override
	public String toString() {
		return "Tiger [animaltype=" + animaltype + ", nooflegs=" + nooflegs + "]";
	}
	
	

}