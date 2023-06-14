package singleton;

public class SingletonByThreadSafe {
	
	private static SingletonByThreadSafe in = null;
	
	//private constructor
	private SingletonByThreadSafe() {
		
	}
	
	//Thread Safe initialization
	public static SingletonByThreadSafe getInstance() {
		if(in == null) {
			synchronized (SingletonByThreadSafe.class) {
				if(in == null) {
					try {
						Thread.sleep(2000);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
					in = new SingletonByThreadSafe();
				}
			}
		}
		return in;
	}

}