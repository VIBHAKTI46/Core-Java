/* program to demonstrate on creating a thread by 
 * extending a thread class
 */
package org.tnsif.multithreading;
public class ThreadProgram extends  Thread {
	public void run() {
		System.out.print("Thread is in the running state");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadProgram t=new ThreadProgram();
		t.start();
	}

}
