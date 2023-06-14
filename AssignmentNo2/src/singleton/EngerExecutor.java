package singleton;

public class EngerExecutor {

	public static void main(String[] args) {
		
		SingletonByEanger singleton1 = SingletonByEanger.getInstance();
		SingletonByEanger singleton2 = SingletonByEanger.getInstance();

		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());

	}

}