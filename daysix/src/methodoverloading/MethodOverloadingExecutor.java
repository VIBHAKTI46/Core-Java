package methodoverloading;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		
		MethodOverloading m1 =new MethodOverloading();
		
		System.out.println(m1.multiplication(12.5f, 2.1f));
		System.out.println(m1.multiplication(1.5f, 4));
		System.out.println(m1.multiplication(5, 2.1f));
		System.out.println(m1.multiplication(2, 7));
		System.out.println(m1.print("Welcome "));
		System.out.println(m1.print("vibhakti","patil"));
		

	}

}