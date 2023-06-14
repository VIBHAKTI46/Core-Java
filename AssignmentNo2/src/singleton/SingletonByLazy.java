package singleton;

public class SingletonByLazy {
	
private static SingletonByLazy in = null;
	
	//private constructor
	private SingletonByLazy() {
		
	}
	
	//lazy initialization
	public static SingletonByLazy getInstance() {
		if(in == null) {
			in = new SingletonByLazy();
		}
		return in;
	}

}