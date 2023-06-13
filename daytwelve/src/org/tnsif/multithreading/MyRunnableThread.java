//create a thread by implementing runnable interface
package org.tnsif.multithreading;
public class MyRunnableThread implements Runnable {

	@Override
	public void run() {
		System.out.print("Thred is in running state");
	}
	public static void main(String[] args) {
		MyRunnableThread t=new MyRunnableThread();
		t.run();
	}

}