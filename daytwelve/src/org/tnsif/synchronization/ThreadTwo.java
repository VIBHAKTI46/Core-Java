package org.tnsif.synchronization;

public class ThreadTwo  extends Thread {
	Powernum p;
	//paramerterized constructor

	public ThreadTwo(Powernum p) {
		super();
		this.p = p;
	}

	public void run()
	{
		p.printpower(3);
	}

}