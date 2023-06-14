package singleton;

public class MyThread implements Runnable  {
	
	@Override
	public void run() {
		SingletonByThreadSafe st = SingletonByThreadSafe.getInstance();
		System.out.println(Thread.currentThread().getName() + " " + st.hashCode());

	}
	

}