package singleton;

public class LazyExecutor {

	public static void main(String[] args) {
		SingletonByLazy sing1 = SingletonByLazy.getInstance();
		SingletonByLazy sing2 = SingletonByLazy.getInstance();

		System.out.println(sing1.hashCode());
		System.out.println(sing2.hashCode());


	}

}