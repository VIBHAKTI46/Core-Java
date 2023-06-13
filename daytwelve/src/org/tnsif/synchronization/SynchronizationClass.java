//without synchronization 
package org.tnsif.synchronization;
public class SynchronizationClass {

	public static void main(String[] args) {
		
		Powernum op=new Powernum();
		Thredone t1 =new Thredone(op);
		ThreadTwo t2=new ThreadTwo(op);
		t1.start();
		t2.start();

	}

}