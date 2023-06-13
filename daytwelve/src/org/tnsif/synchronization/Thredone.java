package org.tnsif.synchronization;
public class Thredone extends Thread {
	Powernum p;
//paramerterized constructor
	public Thredone(Powernum p) {
		super();
		this.p = p;
	}
	
	public void run()
	{
		p.printpower(5);
	}
	

}