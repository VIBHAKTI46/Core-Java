//program on thread lifecycyle
package org.tnsif.multithreading;
public class ThreadLifeCycleProgram extends Thread {
	
	public void run()
	{
		System.out.println("is thred alive "+this.isAlive());
		int x=0;
		while(x<3)
		{
			x++;
			System.out.println("x is :-"+x);
		}
		
	try {	sleep(500);
	System.out.println("is thred alive "+this.isAlive());
	
	}
	catch (InterruptedException e)
	{
		System.out.println("Thred interput....");
	}
	}

	public static void main(String[] args) {
		
		ThreadLifeCycleProgram t=new ThreadLifeCycleProgram();
		System.out.println("Before starting thread is thred alieve ?"+t.isAlive());
		t.start();

	}

}