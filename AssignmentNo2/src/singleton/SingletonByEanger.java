package singleton;

public class SingletonByEanger {
	
private static final SingletonByEanger INSTANCE = new SingletonByEanger();
	
	//private constructor
	private SingletonByEanger() {
		
	}
	
	public static SingletonByEanger getInstance() {
		return INSTANCE;
	}

}